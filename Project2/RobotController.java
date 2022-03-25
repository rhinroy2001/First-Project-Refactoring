/*
 * Ryan Hagen
 * Project 2
 * 10-21-2019
 * CS 140-001
 */


import java.util.Scanner;
class RobotController{
    public static void main(String args[]){
        Robot robot1 = new Robot();
        int forward;
        // variables created to compound forward movement
        int move1 = 0;
        int move2 = 0;
        String robotName = robot1.getName();
        String userInput;
        char command;
        Scanner keyboard = new Scanner(System.in);
        // loop for commands
        do{
            userInput = keyboard.next();
            command = userInput.charAt(0);
            if(command == 'f'){
                System.out.println("enter a number.");
                forward = keyboard.nextInt();

                if(robot1.getDirection() == 'n'){
                    robot1.forward(forward);
                    robot1.setYPosition(forward + move1);

                    System.out.println(robot1.getName() + " moved forward " + forward);
                    move1 = forward;
                    if(robot1.getYPosition() < 0){
                        move1 = move1 * -1;
                    }else if(robot1.getYPosition() == 0){
                        move1 = robot1.getYPosition();
                    }

                }else if(robot1.getDirection() == 'e'){
                    robot1.forward(forward);
                    robot1.setXPosition(move2 + forward);

                    System.out.println(robot1.getName() + " moved forward " + forward);
                    move2 = forward;
                    if(robot1.getXPosition() < 0){
                        move2 = move2 * -1;
                    }else if(robot1.getXPosition() == 0){
                        move2 = robot1.getXPosition();
                    }
                }
                if(robot1.getDirection() == 's'){
                    robot1.forward(forward);
                    robot1.setYPosition(move1 - forward);

                    System.out.println("Robot moved forward " + forward);
                    move1 = forward;
                    if(robot1.getYPosition() < 0){
                        move1 = move1 * -1;
                    }else if(robot1.getYPosition() == 0){
                        move1 = robot1.getYPosition();
                    }

                }else if(robot1.getDirection() == 'w'){
                    robot1.forward(forward);
                    robot1.setXPosition(move2 - forward);

                    System.out.println(robot1.getName() + " moved forward " + forward);
                    move2 = forward;
                    if(robot1.getXPosition() < 0){
                        move2 = move2 * -1;
                    }else if(robot1.getXPosition() == 0){
                        move2 = robot1.getXPosition();
                    }
                }
            }else if(command == 'n'){
                if(robotName == "robot"){
                    System.out.println("Name your robot.");
                    robotName = keyboard.next();
                    robot1.setName(robotName);

                    System.out.println("My name is " + robot1.getName());
                }
            }else if(command == 't'){
                robot1.turnRight();
                System.out.println(robotName + " is now facing " + robot1.toString2());
            }else if(command == 'r'){
                System.out.println(robot1.toString());
            }else if(command == 'e'){
                Runtime.getRuntime().exit(1);
            }else{
                System.out.println(robot1.getName() + " does not recognize " + userInput + " as a command");
            }
        }
        while(command != 'e');
    } 
}