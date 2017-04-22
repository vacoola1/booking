package com.vacoola.booking.model;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by r.vakulenko on 21.04.2017.
 */
public class Property implements Validation{
    public boolean validate(ResultSet row) {
        return true;
    }

    public String getAddress(ResultSet propRs) throws SQLException{
        return propRs.getString("ADDRESS");
    }

}
