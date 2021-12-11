package com.hibernate.observers;

public interface Observer {
    public void update(float temp, float press, float humid);
    public void display();
}
