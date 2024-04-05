package com.example.back_end_booking.constan;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

public class DefaultId<T> {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(strategy = "uuid2",name = "uuid2")
    @Column(name = "id",columnDefinition = "varchar(36)")
    protected T defaultId;
}
