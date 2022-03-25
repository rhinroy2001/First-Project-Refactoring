import java.util.Scanner;

public class UnknownCommand implements Command{
    @Override
    public void execute(Robot robot, Scanner keyboard) {
        //System.out.println(robot.getName() + " does not recognize " + userInput + " as a command");
    }
}
