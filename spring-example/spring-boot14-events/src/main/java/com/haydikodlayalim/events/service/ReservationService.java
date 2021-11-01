package com.haydikodlayalim.events.service;

import com.haydikodlayalim.events.api.HotelBookRequest;
import com.haydikodlayalim.events.event.ReservationCreatedEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @Async
    public void publishReservationEvent(HotelBookRequest hotelBookRequest) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        applicationEventPublisher.publishEvent(new ReservationCreatedEvent(hotelBookRequest));
    }
}
