package com.vacoola.booking.gateway;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by r.vakulenko on 22.04.2017.
 */
public class CustomerGateway extends AbstractTableDataGateway {
    private static final String TABLE_NAME = "CUSTOMER";

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
