package com.vacoola.booking;

import com.vacoola.booking.dto.PropertyDto;
import com.vacoola.booking.gateway.BookingGateway;
import com.vacoola.booking.gateway.LocationGateway;
import com.vacoola.booking.gateway.OwnerGateway;
import com.vacoola.booking.gateway.PropertyGateway;
import com.vacoola.booking.model.Booking;
import com.vacoola.booking.model.Location;
import com.vacoola.booking.model.Owner;
import com.vacoola.booking.model.Property;
import com.vacoola.booking.selectFactory.BookingCriteria;
import com.vacoola.booking.selectFactory.BookingSelectFactory;
import com.vacoola.booking.selectFactory.PropertyCriteria;
import com.vacoola.booking.selectFactory.PropertySelectFactory;

import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by r.vakulenko on 22.04.2017.
 */
public class BookingService {

    public List<PropertyDto> getAvaliables(Integer locationId, String address, Date dateFrom, Date dateTo) throws RuntimeException {

        try {
            PropertyGateway propertyGateway = new PropertyGateway();
            BookingGateway bookingGateway = new BookingGateway();
            LocationGateway locationGateway = new LocationGateway();
            OwnerGateway ownerGateway = new OwnerGateway();

            Booking booking = new Booking();
            Property property = new Property();
            Location location = new Location();
            Owner owner = new Owner();

            PropertySelectFactory propertyFactory = new PropertySelectFactory();
            PropertyCriteria propertyCriteria = new PropertyCriteria();
            propertyCriteria.setLocation(locationId);
            propertyCriteria.setAddress(address);
            String propertySelection = propertyFactory.newSelection(propertyCriteria);

            BookingSelectFactory bookingFactory = new BookingSelectFactory();
            BookingCriteria bookingCriteria = new BookingCriteria();
            bookingCriteria.setDateFrom(dateFrom);
            bookingCriteria.setDateTo(dateTo);
            String bookingSelection = bookingFactory.newSelection(bookingCriteria);


            ResultSet propertiesRs = propertyGateway.findSelected(propertySelection);
            ResultSet bookingRs = bookingGateway.findSelected(bookingSelection);

            List<Integer> propertyiesID = booking.getAvaliables(propertiesRs, bookingRs);
            List<PropertyDto> propertiesDTO = new ArrayList<PropertyDto>();

            for (Integer propId : propertyiesID) {
                ResultSet propRs = propertyGateway.find(propId);
                ResultSet locationRs = locationGateway.find(propRs.getInt("LOCATION_ID"));
                ResultSet ownerRs = ownerGateway.find(propRs.getInt("OWNER_ID"));

                propertiesDTO.add(
                        new PropertyDto(
                                propId,
                                property.getAddress(propRs),
                                location.getName(locationRs),
                                owner.getName(ownerRs)));
            }

            return propertiesDTO;


        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }


    public Integer book(Integer customerId, Integer propertyId, Date dateFrom, Date dateTo) throws RuntimeException {
        try {
            return 1;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
