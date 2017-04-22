package com.vacoola.booking.model;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by r.vakulenko on 21.04.2017.
 */
public class Location implements Validation {
    public boolean validate(ResultSet row) {
        return true;
    }

    public String getName(ResultSet locationRs) throws SQLException{
        return locationRs.getString("NAME");
    }

}
