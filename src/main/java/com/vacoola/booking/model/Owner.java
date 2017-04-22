package com.vacoola.booking.model;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by r.vakulenko on 21.04.2017.
 */
public class Owner implements Validation {
    public boolean validate(ResultSet row) {
        return true;
    }

    public String getName(ResultSet ownerRs) throws SQLException{
        return ownerRs.getString("NAME");
    }
}
