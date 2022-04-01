import java.util.Scanner;

public interface Command {
    void execute(Robot robot, Scanner keyboard);
    boolean isSupported(char command);
}
