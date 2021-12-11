package com.hibernate.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Location {
    private int locationId;
    private double latitude;
    private double longitude;
    private String cityName;
    private String countryName;
    private List<Weather> weather;

    @Id
    @Column(name = "location_id")
    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    @Basic
    @Column(name = "latitude")
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @Basic
    @Column(name = "longitude")
    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Basic
    @Column(name = "city_name")
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Basic
    @Column(name = "country_name")
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return locationId == location.locationId && Double.compare(location.latitude, latitude) == 0 && Double.compare(location.longitude, longitude) == 0 && Objects.equals(cityName, location.cityName) && Objects.equals(countryName, location.countryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locationId, latitude, longitude, cityName, countryName);
    }

    @OneToMany(mappedBy = "locationByLocationId")
    public List<Weather> getWeather(){
        return weather;
    }

    public void setWeather(List<Weather> weather){
        this.weather = weather;
    }
}
