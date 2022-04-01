import java.util.Scanner;

public class TurnRightCommand implements Command {
    @Override
    public void execute(Robot robot, Scanner keyboard) {
        robot.turnRight();
        System.out.println(robot.getName() + " is now facing " + robot.getDirectionAsString());
    }

    @Override
    public boolean isSupported(char command) {
        return command == 't';
    }
}
