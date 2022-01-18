package orderPattern.lightCommand;

import orderPattern.Command;

/**
 * Created by Younger on 2022/1/17.
 */
public class LightOnCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Light is on!");
    }

    @Override
    public void cancel() {
        System.out.println("Light set off!");
    }
}
