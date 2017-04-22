package com.vacoola.booking.model;

import java.sql.ResultSet;

/**
 * Created by r.vakulenko on 22.04.2017.
 */
public interface Validation {
    boolean validate(ResultSet row);
}
