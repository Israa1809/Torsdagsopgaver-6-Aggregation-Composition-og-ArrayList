package com.Israa.Task1;

public class Main
{
    public static void main(String[] args)
    {
        // write your code here

        // 1.h In the main method, instantiate a new Driver, populating the fields with your own name and age.
        Driver a = new Driver("Israa", 27);

        // 1.i In the main method, instantiate a new car, populating the field with whatever values you see fit.
        Car firstCar = new Car("VOLKSWAGEN", "polo", 2002, "hatchback");

        // 1.j In the main method, assign the driver to the car created, using the setter method created in step 1.e
        firstCar.setDriver(a);

        //1.k print the toString method of the car you've created followed by the toString method of the driver.
        System.out.println("Info about the car and driver: " + firstCar + ", and" + a + "\n");

        // 1.l In the main method, create yet another car and assign the same driver to this car.
        Car secondCar = new Car("BMW", "X5", 2015, "jeep");
        secondCar.setDriver(a);

        // 1.m repeat the step 1.k for the new car created in 1.l.
        System.out.println("Info about the car and driver: " + secondCar + ", and" + a);
    }

}



