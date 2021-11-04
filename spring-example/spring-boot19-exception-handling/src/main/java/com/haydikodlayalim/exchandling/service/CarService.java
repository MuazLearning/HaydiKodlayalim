package com.haydikodlayalim.exchandling.service;

import com.haydikodlayalim.exchandling.dto.Car;
import com.haydikodlayalim.exchandling.exception.EntityNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private static List<Car> carList = new ArrayList<>();

    @PostConstruct
    private void init() {
        carList.add(new Car("Brand 1", "Car A"));
        carList.add(new Car("Brand 2", "Car B"));
        carList.add(new Car("Brand 3", "Car C"));
    }

    public Car getCar(String name) {
        if (name.startsWith("1")){
            throw new IllegalArgumentException();
        }
        return carList.stream().filter(item -> item.getName().equals(name)).findFirst()
                .orElseThrow(() -> new EntityNotFoundException(name));
    }
}
