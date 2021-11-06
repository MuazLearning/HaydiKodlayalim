package com.haydikodlayalim.webflux;

import com.haydikodlayalim.webflux.entity.Employee;
import com.haydikodlayalim.webflux.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@SpringBootApplication
public class WebfluxApplication {

    @Autowired
    private EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(WebfluxApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void appStart() {
        if (employeeRepository.count().block() == 0) {
            IntStream.range(0, 100)
                    .mapToObj(this::generate)
                    .map(employeeRepository::save)
                    .collect(Collectors.toList())
                    .forEach(item -> item.subscribe(System.out::println)); // Bu kodun sade hali (t) -> System.out.println(t)
        }
    }

    private Employee generate(int i) {
        return Employee.builder()
                .name("Employee " + i)
                .surname("Surname " + i)
                .birthDate(LocalDate.now()).build();
    }
}
