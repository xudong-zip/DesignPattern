package orderPattern.fanCommand;

import orderPattern.Command;

/**
 * Created by Younger on 2022/1/17.
 */
public class FanOffCommand extends FanCommand {
    @Override
    public void execute() {
        status = LEVAL;
        LEVAL = "OFF";
        System.out.println("Fan is off!");
    }
}
