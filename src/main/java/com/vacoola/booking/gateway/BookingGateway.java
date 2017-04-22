package com.vacoola.booking.gateway;

import com.vacoola.booking.dataSource.Db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by r.vakulenko on 21.04.2017.
 */
public class BookingGateway extends AbstractTableDataGateway {

    private static final String TABLE_NAME = "BOOKING";

    @Override
    String getTableName() {
        return TABLE_NAME;
    }

    @Override
    public int create(ResultSet row) {
        return 0;
    }

    @Override
    public boolean update(ResultSet row) {
        return false;
    }
}
