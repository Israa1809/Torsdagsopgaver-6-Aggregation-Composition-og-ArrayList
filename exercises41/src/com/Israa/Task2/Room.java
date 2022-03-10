package com.Israa.Task2;

public class Room

{
    //2.a Create a Room.java class with the following fields (use appropriate types): walls.java, numberOfDoors, numberOfLamps, numberOfWindows
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;
    private int walls;

    // 2.b Create a constructor that populates all the fields above.
    public Room(int walls, int numberOfDoors, int numberOfLamps, int numberOfWindows)
    {
        this.walls = walls;
        this.numberOfDoors = numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }


    // 2.c Create getters() for each of the fields above.
    public int getWalls()
    {
        return walls;
    }

    public int getNumberOfDoors()
    {
        return numberOfDoors;
    }

    public int getNumberOfLamps()
    {
        return numberOfLamps;
    }

    public int getNumberOfWindows()
    {
        return numberOfWindows;
    }


}
