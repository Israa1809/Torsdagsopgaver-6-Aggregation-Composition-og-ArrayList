package com.Israa.Task1;

public class Driver
{
    // 1.a Create a Driver.java class with the following private fields (use appropriate types): Name and Age
    private String name;
    private int age;

    //1.b Create a constructor that populates all the fields above.
    public Driver(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    //1.g override the toString method in the Driver class, returning: " is driven by "+name
    @Override
    public String toString()
    {
        return " is driven by " + name;
    }
}
