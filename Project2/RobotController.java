/*
 * Ryan Hagen
 * Project 2
 * 10-21-2019
 * CS 140-001
 */


import java.util.Arrays;
import java.util.Scanner;
class RobotController{
    public static void main(String args[]){
        Robot robot1 = new Robot();
        CommandRegistry registry = CommandRegistry.builder().build();
        String userInput;
        char command;
        Scanner keyboard = new Scanner(System.in);
        // loop for commands
        do{
            userInput = keyboard.next();
            command = userInput.charAt(0);
            registry.getCommand(command).execute(robot1, keyboard);
        }
        while(command != 'e');
    } 
}