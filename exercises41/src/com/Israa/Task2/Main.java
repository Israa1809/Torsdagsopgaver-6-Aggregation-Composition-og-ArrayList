package com.Israa.Task2;

import com.Israa.Task1.Car;

import java.util.ArrayList;

public class Main
{
    Room roomOne;
    Room roomTwo;
    Room roomThree;

    public static void main(String[] args)
    {
        ArrayList<Room> rooms = new ArrayList<Room>();

        //2.g In your main method, instantiate at least three different rooms.
        Room roomOne = new Room(6, 2, 10, 8);
        Room roomTwo = new Room(4, 1, 1, 2);
        Room roomThree = new Room(5, 1, 2, 4);

        //2.h Add the three rooms to a collection (preferably of the same data type used for the "Rooms" field in your Building.java class).
        rooms.add(roomOne);
        rooms.add(roomTwo);
        rooms.add(roomThree);

        //2.i In your main method, instantiate a new building.
        Building building = new Building(rooms, 4, false, 4);

        //2.j print the total number of lamps in the entire building.
        totalOfLamps(rooms, building);

        //2.k make an if statement that checks if numberOfFloors > number of Rooms. if true, then print "This is an odd building".
        building.isBuildingOdd();
    }

    public static void totalOfLamps(ArrayList<Room> theArrList, Building theBuilding)
    {
        int totalOfLamps = 0;

        for (int i = 0; i < theArrList.size(); i++)
        {
            totalOfLamps = totalOfLamps + theBuilding.rooms.get(i).getNumberOfLamps();
        }
        System.out.println(totalOfLamps);
    }
}


