package com.hibernate.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Weather {
    private int weatherId;
    private double temperature;
    private double pressure;
    private double humidity;
    private int windDirection;
    private double windSpeed;
    private Date weatherDate;
    private Location locationByLocationId;

    @Id
    @Column(name = "weather_id")
    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    @Basic
    @Column(name = "temperature")
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Basic
    @Column(name = "pressure")
    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    @Basic
    @Column(name = "humidity")
    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    @Basic
    @Column(name = "wind_direction")
    public int getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(int windDirection) {
        this.windDirection = windDirection;
    }

    @Basic
    @Column(name = "wind_speed")
    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    @Basic
    @Column(name = "weather_date")
    public Date getWeatherDate() {
        return weatherDate;
    }

    public void setWeatherDate(Date weatherDate) {
        this.weatherDate = weatherDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weather weather = (Weather) o;
        return weatherId == weather.weatherId && Double.compare(weather.temperature, temperature) == 0 && Double.compare(weather.pressure, pressure) == 0 && Double.compare(weather.humidity, humidity) == 0 && windDirection == weather.windDirection && Double.compare(weather.windSpeed, windSpeed) == 0 && Objects.equals(weatherDate, weather.weatherDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weatherId, temperature, pressure, humidity, windDirection, windSpeed, weatherDate);
    }

    @ManyToOne
    @JoinColumn(name = "location_id", referencedColumnName = "location_id", nullable = false)
    public Location getLocationByLocationId() {
        return locationByLocationId;
    }

    public void setLocationByLocationId(Location locationByLocationId) {
        this.locationByLocationId = locationByLocationId;
    }
}
