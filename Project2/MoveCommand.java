import java.util.Scanner;

public class MoveCommand implements Command {
    @Override
    public void execute(Robot robot, Scanner keyboard) {
        int forward;
        int move1 = 0;
        int move2 = 0;
        System.out.println("enter a number.");
        forward = keyboard.nextInt();

        if(robot.getDirection() == 'n'){
            robot.forward(forward);
            robot.setYPosition(forward + move1);

            System.out.println(robot.getName() + " moved forward " + forward);
            move1 = forward;
            if(robot.getYPosition() < 0){
                move1 = move1 * -1;
            }else if(robot.getYPosition() == 0){
                move1 = robot.getYPosition();
            }

        }else if(robot.getDirection() == 'e'){
            robot.forward(forward);
            robot.setXPosition(move2 + forward);

            System.out.println(robot.getName() + " moved forward " + forward);
            move2 = forward;
            if(robot.getXPosition() < 0){
                move2 = move2 * -1;
            }else if(robot.getXPosition() == 0){
                move2 = robot.getXPosition();
            }
        }
        if(robot.getDirection() == 's'){
            robot.forward(forward);
            robot.setYPosition(move1 - forward);

            System.out.println("Robot moved forward " + forward);
        }else if(robot.getDirection() == 'w'){
            robot.forward(forward);
            robot.setXPosition(move2 - forward);

            System.out.println(robot.getName() + " moved forward " + forward);
        }
    }

    @Override
    public boolean isSupported(char command) {
        return command == 'f';
    }
}
