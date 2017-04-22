package com.vacoola.booking.dto;

/**
 * Created by r.vakulenko on 22.04.2017.
 */
public class PropertyDto {
    private int id;
    private String address;
    private String location;
    private String owner;

    public PropertyDto(int id, String address, String location, String owner) {
        this.id = id;
        this.address = address;
        this.location = location;
        this.owner = owner;
    }
}
