package com.vacoola.booking.selectFactory;

import java.sql.Date;

/**
 * Created by r.vakulenko on 22.04.2017.
 */
public class BookingCriteria implements SelectionCriteria {

    private Date dateFrom;
    private Date dateTo;

    public Date getDateFrom() {
        return dateFrom;
    }
    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }
    public Date getDateTo() {
        return dateTo;
    }
    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }
}
