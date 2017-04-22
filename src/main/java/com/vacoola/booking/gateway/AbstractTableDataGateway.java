package com.vacoola.booking.gateway;

import com.vacoola.booking.dataSource.Db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by r.vakulenko on 21.04.2017.
 */
public abstract class AbstractTableDataGateway {
    abstract String getTableName();
    abstract int create(ResultSet row);
    abstract boolean update(ResultSet row);

    boolean delete(int id) throws SQLException {
        PreparedStatement st = Db.getConnection().prepareStatement("DELETE FROM " + getTableName() + " WHERE ID=?;");
        st.setInt(1, id);
        return st.executeUpdate() == 1;
    }

    public ResultSet find(int id) throws SQLException {
        PreparedStatement st = Db.getConnection().prepareStatement("SELECT * FROM " + getTableName() + " WHERE ID=?;");
        st.setInt(1, id);
        return st.executeQuery();
    }

    public ResultSet findAll() throws SQLException {
        return Db.getConnection()
                .prepareStatement("SELECT * FROM " + getTableName() + ";")
                .executeQuery();
    }

    public ResultSet findSelected(String sql) throws SQLException {
        return Db.getConnection()
                .prepareStatement(sql)
                .executeQuery();
    }


}


