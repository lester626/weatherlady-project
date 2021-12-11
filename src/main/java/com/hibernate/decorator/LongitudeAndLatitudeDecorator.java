package com.hibernate.decorator;

import java.text.DecimalFormat;

public class LongitudeAndLatitudeDecorator implements AddLocationInterface{
    private final AddLocationInterface addLocationInterface;
    private DecimalFormat df = new DecimalFormat();

    public LongitudeAndLatitudeDecorator(final AddLocationInterface addLocationInterface) {
        this.addLocationInterface = addLocationInterface;
    }

    @Override
    public String addCountry() {
        return addLocationInterface.addCountry();
    }

    @Override
    public String addCity() {
        return addLocationInterface.addCity();
    }

    @Override
    public Double addLongitude() {
        return Double.parseDouble(df.format(Math.random() * 1000));
    }

    @Override
    public Double addLatitude() {
        return Double.parseDouble(df.format(Math.random() * 1000));
    }
}
