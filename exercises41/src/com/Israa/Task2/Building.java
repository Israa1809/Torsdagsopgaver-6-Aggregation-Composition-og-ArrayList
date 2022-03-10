package com.Israa.Task2;

import java.util.ArrayList;

// 2.d Create a Building.java class with the following fields (use appropriate types): rooms, numberOfBathrooms, numberOfFloors, isOfficeBuilding

public class Building
{

    ArrayList<Room> rooms = new ArrayList<Room>();
    private int numberOfBathrooms;
    private boolean isOfficeBuilding;
    private int numbersOfFloors;
    //2.e Create a constructor that populates all the fields above.

    public Building(ArrayList<Room> rooms, int numberOfBathrooms, boolean isOfficeBuilding, int numbersOfFloors)
    {
        this.rooms = rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.isOfficeBuilding = isOfficeBuilding;
        this.numbersOfFloors = numbersOfFloors;
    }

    //2.f Create getters() for each of the fields above.
    public ArrayList<Room> getRooms()
    {
        return rooms;
    }

    public int getNumberOfBathrooms()
    {
        return numberOfBathrooms;
    }

    public boolean getIsOfficeBuilding()
    {
        return isOfficeBuilding;
    }

    public int getNumbersOfFloors()
    {
        return numbersOfFloors;
    }


    public boolean isBuildingOdd()
    {
        if (numbersOfFloors > rooms.size())
        {
            isOfficeBuilding = true;
            System.out.println("This is an odd building");
        }
        return isOfficeBuilding;
    }
}







