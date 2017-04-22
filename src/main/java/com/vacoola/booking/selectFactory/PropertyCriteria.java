package com.vacoola.booking.selectFactory;

import java.sql.Date;

/**
 * Created by r.vakulenko on 22.04.2017.
 */
public class PropertyCriteria implements SelectionCriteria {

    private Integer location;
    private String address;

    public Integer getLocation() {
        return location;
    }
    public void setLocation(Integer location) {
        this.location = location;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
