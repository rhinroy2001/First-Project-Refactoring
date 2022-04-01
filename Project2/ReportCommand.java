import java.util.Scanner;

public class ReportCommand implements Command{
    @Override
    public void execute(Robot robot, Scanner keyboard) {
        System.out.println(robot.toString());
    }

    @Override
    public boolean isSupported(char command) {
        return command == 'r';
    }
}
