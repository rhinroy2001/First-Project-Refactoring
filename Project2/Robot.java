/*
 * Ryan Hagen
 * Project 2
 * 10-21-2019
 * CS 140-001
 */

import java.util.Scanner;

class Robot{
    private String name;
    private int xPosition;
    private int yPosition;
    private char direction;
    private String direction2;

    
    public Robot(){
        xPosition = 0;
        yPosition = 0;
        direction = 'n';
        name = "robot";
        direction2 = null;

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
        if(direction == 'n'){
            direction = 'e';
        }else if(direction == 'e'){
            direction = 's';
        }else if(direction == 's'){
            direction = 'w';
        }else if(direction == 'w'){
            direction = 'n';
        }

        if(direction == 'n'){
            direction2 = "North";
        }else if(direction == 'e'){
            direction2 = "East";
        }else if(direction == 's'){
            direction2 = "South";
        }else if(direction == 'w'){
            direction2 = "West";
        }

        return direction2; 
    }
    // converts direction from a character to a string
    public String toString2(){
        if(direction == 'n'){
            direction2 = "North";
        }else if(direction == 'e'){
            direction2 = "East";
        }else if(direction == 's'){
            direction2 = "South";
        }else if(direction == 'w'){
            direction2 = "West";
        }
        return direction2;
    }
    // report function
    public String toString(){
        if(direction == 'n'){
            direction2 = "North";
        }else if(direction == 'e'){
            direction2 = "East";
        }else if(direction == 's'){
            direction2 = "South";
        }else if(direction == 'w'){
            direction2 = "West";
        }
        return name + " is at (" + xPosition + ", " + yPosition + ") facing " + direction2;

    }

}

