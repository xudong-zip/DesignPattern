package orderPattern.lightCommand;

import orderPattern.Command;

/**
 * Created by Younger on 2022/1/17.
 */
public class LightOffCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Light is off!");
    }

    @Override
    public void cancel() {
        System.out.println("Light set on!");
    }
}
