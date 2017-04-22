package com.vacoola.booking.model;

import java.sql.ResultSet;

/**
 * Created by r.vakulenko on 21.04.2017.
 */
public class Customer implements Validation {
    public boolean validate(ResultSet row) {
        return true;
    }
}
