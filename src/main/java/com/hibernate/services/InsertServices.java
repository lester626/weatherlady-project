package com.hibernate.services;

import com.hibernate.utilities.HibernateUtil;
import org.hibernate.Session;
import com.hibernate.entities.*;

import java.text.DecimalFormat;

public class InsertServices {
    private Session session;
    private DecimalFormat df = new DecimalFormat("#.##");
    private String addCountry;
    private String addCity;
    private Double addLongitude;
    private Double addLatitude;

    public InsertServices(String addCountry, String addCity, Double addLongitude, Double addLatitude) {
        this.addCountry = addCountry;
        this.addCity = addCity;
        this.addLongitude = addLongitude;
        this.addLatitude = addLatitude;
    }

    public void insertLocation() {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Location location = new Location();

        location.setCountryName(addCountry);
        location.setCityName(addCity);
        location.setLongitude(addLongitude);
        location.setLatitude(addLatitude);

        session.save(location);
        session.getTransaction().commit();

        session.getSessionFactory().close();
    }
}
