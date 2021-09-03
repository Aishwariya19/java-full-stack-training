
package com.example;



public class Elevator {
    
    private int maxFloor=9;
    private int minFloor=-1;
    
    public void goUp(int floorNumber)
    {
        if(floorNumber>maxFloor)
        {
            System.out.println("wrong floor number can not go up");
        }
        else
        {
            System.out.println("I am in reached floor: "+floorNumber);
        }
    }
    
    public void goDown(int floorNumber)
    {
        if(floorNumber<minFloor)
        {
            System.out.println("wrong floor number can not go down.");
        }
        else
        {
            System.out.println("I am in reached floor: "+floorNumber);
        }
    }
    

 

}