package com.haydikodlayalim.ticketservice.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass // Bütün entitylere ait olan özellikleri burada tutar.
public class BaseEntityModel implements Serializable {

    @CreatedDate
    @Column(name = "created_date")
    private Date createdAt;

    @LastModifiedDate
    @Column(name = "updated_date")
    private Date updatedAt;
}
