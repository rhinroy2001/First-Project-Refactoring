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
//        int move1 = 0;
//        int move2 = 0;
        String robotName = robot1.getName();
        String userInput;
        char command;
        Scanner keyboard = new Scanner(System.in);
        // loop for commands
        do{
            userInput = keyboard.next();
            command = userInput.charAt(0);
            if(command == 'f'){
                new MoveCommand().execute(robot1, keyboard);
            }else if(command == 'n'){
                new NameCommand().execute(robot1, keyboard);
            }else if(command == 't'){
                new TurnRightCommand().execute(robot1, keyboard);
            }else if(command == 'r'){
                new ReportCommand().execute(robot1, keyboard);
            }else if(command == 'e'){
                new ExitCommand().execute(robot1, keyboard);
            }else{
                new UnknownCommand().execute(robot1, keyboard);
            }
        }
        while(command != 'e');
    } 
}