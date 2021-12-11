package com.hibernate.decorator;
import com.hibernate.services.*;

import java.text.DecimalFormat;

public class AddLocationDecorate implements AddLocationInterface{

    private DecimalFormat df = new DecimalFormat();
    private String insertCountry;
    private String insertCity;
    private Double insertLongitude = Double.parseDouble(df.format(Math.random() * 1000));
    private Double insertLatitude = Double.parseDouble(df.format(Math.random() * 1000));

    @Override
    public String addCountry() {
        return insertCountry;
    }

    @Override
    public String addCity() {
        return insertCity;
    }

    @Override
    public Double addLongitude() {
        return insertLongitude;
    }

    @Override
    public Double addLatitude() {
        return insertLatitude;
    }
}
