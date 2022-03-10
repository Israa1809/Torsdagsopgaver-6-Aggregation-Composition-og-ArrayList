package com.Israa.Task1;

// 1.c Create a Car.java class with the following private fields (use appropriate types): make, model, year, bodyStyle, driver.


public class Car
{
    private String make;
    private String model;
    private int year;
    private String bodyStyle;
    private Driver driver;

    //  1.d Create a constructor, that populates all the fields above, except the Driver.
    public Car(String make, String model, int year, String bodyStyle)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;
    }

    //   1.e Create a Getter and a Setter for the Driver variable.
    public Driver getDriver()
    {
        return this.driver;
    }

    public void setDriver(Driver driver)
    {
        this.driver = driver;

    }

    // 1.f override the toString method in the Car class, returning: "Make: "+make+". Model: "+model+ " ("+ year + "), BodyStyle: "+bodyStyle
    @Override
    public String toString()
    {
        return "Make: " + make + ". Model: " + model + "(" + year + "), BodyStyle: " + bodyStyle;
    }
}

