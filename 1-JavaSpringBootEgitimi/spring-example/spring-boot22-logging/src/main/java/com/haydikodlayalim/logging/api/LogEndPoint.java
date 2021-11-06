package com.haydikodlayalim.logging.api;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/log")
public class LogEndPoint {

//    Logger logger = LoggerFactory.getLogger(this.getClass());  @Slf4j bu anotasyonu kullanarak logger ile loglama yapabiliriz.

    @GetMapping
    public String getDetails() {
        log.info("get details methodu basladi");
        return internalLogDetail();
    }

    private String internalLogDetail() {
        try {
            log.debug("internalLogDetail methodu basladi");
            Thread.sleep(1000);
            return "API Mesaj";
        } catch (InterruptedException e) {
            log.error("Hata : {}", e);
        }
        return "";
    }

    /**
     - Loglama asenkron bir şekilde olmalıdır.
     - printStackTrace ve System.out.println() kullanılmamalıdır. (formatlara aykırı)
     - Sensitive data olmamalıdır.
     - Tüm logların belli bir formatla yazılması gerekmektedir.
     - Level dikkatli kullanılmalıdır.
     - Farklı levellar için farklı appendlar kullanılabilir.
     */
}
