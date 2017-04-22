package com.vacoola.booking.selectFactory;

/**
 * Created by r.vakulenko on 22.04.2017.
 */
public class PropertySelectFactory implements SelectionFactory {

    public String newSelection(SelectionCriteria criteria) {
        PropertyCriteria propertyCriteria = (PropertyCriteria) criteria;
        StringBuilder sb = new StringBuilder("SELECT ID, ADDRESS, LOCATION_ID, OWNER_ID FROM PROPERTY WHERE TRUE");
        if (propertyCriteria.getLocation() != null) {
            String criteriaStr = String.format(" AND LOCATION_ID = {0}", propertyCriteria.getLocation());
            sb.append(criteriaStr);
        }
        if (propertyCriteria.getAddress() != null) {
            String criteriaStr = String.format(" AND ADDRESS LIKE '%{0}%'", propertyCriteria.getAddress());
            sb.append(criteriaStr);
        }
        return sb.toString();
    }
}
