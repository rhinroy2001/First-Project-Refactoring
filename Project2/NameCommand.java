import java.util.Scanner;

public class NameCommand implements Command{
    public void execute(Robot robot, Scanner keyboard){
        if(robot.getName() == "robot") {
            System.out.println("Name your robot.");
            robot.setName(keyboard.next());
            System.out.println("My name is " + robot.getName());
        }
    }
}
