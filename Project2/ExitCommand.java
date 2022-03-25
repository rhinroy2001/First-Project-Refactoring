import java.util.Scanner;

public class ExitCommand implements Command{
    @Override
    public void execute(Robot robot, Scanner keyboard) {
        Runtime.getRuntime().exit(1);
    }
}
