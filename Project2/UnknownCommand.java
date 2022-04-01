import java.util.Scanner;

public class UnknownCommand implements Command{
    private char command;
    @Override
    public void execute(Robot robot, Scanner keyboard) {
        System.out.println(robot.getName() + " does not recognize " + command + " as a command");
    }

    @Override
    public boolean isSupported(char command) {
        this.command = command;
        return true;
    }
}
