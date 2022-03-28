package com.haydikodlayalim.ticketservice.model;

import lombok.Getter;

@Getter
public enum PriorityType {
    URGENT("Acil"),
    LOW("Azalık"),
    HIGH("Yüksek");

    private String label;

    PriorityType(String label) {
        this.label = label;
    }
}
