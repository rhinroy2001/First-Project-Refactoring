import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CommandRegistry {
   private final List<Command> registry;

    private CommandRegistry(List<Command> registry) {
        this.registry = registry;
    }

    public Command getCommand(char command){
        for(Command c : registry){
            if(c.isSupported(command)){
                return c;
            }
        }
        throw new RuntimeException("impossible exception");

    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private List<Command> registry;

        public Builder add(Command command){
            if(registry == null){
                registry = new ArrayList<>();
            }
            registry.add(command);
            return this;
        }

        public CommandRegistry build(){
            if(registry == null){
                add(new UnknownCommand());
                add(new MoveCommand());
                add(new NameCommand());
                add(new ExitCommand());
                add(new ReportCommand());
                add(new TurnRightCommand());
            }
            return new CommandRegistry(registry);
        }


    }
}
