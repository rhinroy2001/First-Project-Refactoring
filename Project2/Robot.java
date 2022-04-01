/*
 * Ryan Hagen
 * Project 2
 * 10-21-2019
 * CS 140-001
 */

import java.util.HashMap;
import java.util.Map;

class Robot{
    private static Map<Character, String> directions = new HashMap<>();
    static{
        directions.put('n', "North");
        directions.put('s', "South");
        directions.put('e', "East");
        directions.put('w', "West");
    }
    private static Map<Character, Character> turnRight = new HashMap<>();
    static{
        turnRight.put('n', 'e');
        turnRight.put('s', 'w');
        turnRight.put('e', 's');
        turnRight.put('w', 'n');
    }
    private String name;
    private int xPosition;
    private int yPosition;
    private char direction;

    
    public Robot(){
        xPosition = 0;
        yPosition = 0;
        direction = 'n';
        name = "robot";

    }

    public String Robot(int x, int y){
        this.xPosition = x;
        this.yPosition = y;
        return (xPosition + ", " + yPosition);

    }

    public String Robot(String name){
        this.name = name;
        return name;
    }

    public int getXPosition(){
        return xPosition;
    }

    public int getYPosition(){
        return yPosition;
    }

    public String getName(){
        return name;
    }

    public char getDirection(){
        return direction ;
    }

    public void setXPosition(int xPosition){
        this.xPosition = xPosition;
    }

    public void setYPosition(int yPosition){
        this.yPosition = yPosition;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDirection(char direction){
        this.direction = direction;
    }

    public double distanceTo(Robot r){
        return  Math.abs(xPosition - yPosition);
    }

    public int forward(int num){
        return num;
    }

    public String turnRight(){
        direction = turnRight.get(direction);
        return getDirectionAsString();
    }
    // converts direction from a character to a string
    public String getDirectionAsString(){
        return directions.get(direction);
    }
    // report function
    public String toString(){
        return name + " is at (" + xPosition + ", " + yPosition + ") facing " + getDirectionAsString();

    }

}

