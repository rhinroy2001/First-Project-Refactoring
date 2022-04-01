import java.util.Scanner;

public class NameCommand implements Command{
    public void execute(Robot robot, Scanner keyboard){
        if(robot.getName().equals("robot")) {
            System.out.println("Name your robot.");
            robot.setName(keyboard.next());
            System.out.println("My name is " + robot.getDirection());
        }
    }

    @Override
    public boolean isSupported(char command) {
        return command == 'n';
    }
}
