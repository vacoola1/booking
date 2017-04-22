package com.vacoola.booking.selectFactory;

/**
 * Created by r.vakulenko on 22.04.2017.
 */
public class BookingSelectFactory implements SelectionFactory {

    public String newSelection(SelectionCriteria criteria) {
        BookingCriteria bookingCriteria = (BookingCriteria) criteria;
        StringBuilder sb = new StringBuilder("SELECT ID, PROPERTY_ID, CUSTOMER_ID, DATE_FROM, DATE_TO FROM BOOKING WHERE TRUE");
        if (bookingCriteria.getDateFrom() != null) {
            String criteriaStr = String.format(" AND DATE_TO >= '{0}'", bookingCriteria.getDateFrom());
            sb.append(criteriaStr);
        }
        if (bookingCriteria.getDateTo() != null) {
            String criteriaStr = String.format(" AND DATE_FROM <='{0}'", bookingCriteria.getDateTo());
            sb.append(criteriaStr);
        }
        return sb.toString();
    }
}
