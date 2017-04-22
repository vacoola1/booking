package com.vacoola.booking.model;

import com.vacoola.booking.dto.PropertyDto;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by r.vakulenko on 21.04.2017.
 */
public class Booking implements Validation{

    public boolean validate(ResultSet row) {
        return true;
    }

/*    public ResultSet book(int customerId, int propertyId, Date dateFrom, Date dateTo) {
        return null;
    }*/

    public List<Integer> getAvaliables(ResultSet properties, ResultSet bookings) throws SQLException {
        List<Integer> avaliavlePropIds = new ArrayList<Integer>();
        while (properties.next()) {
            boolean isPropFree = true;
            while (bookings.next()) {
                if (properties.getInt("ID") == bookings.getInt("PROPERTY_ID")) {
                    isPropFree = false;
                    break;
                }
            }
            if (isPropFree) {
                avaliavlePropIds.add(properties.getInt("ID"));
            }
        }
        return avaliavlePropIds;
    }

}
