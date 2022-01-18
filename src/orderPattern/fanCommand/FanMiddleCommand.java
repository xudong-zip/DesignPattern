package orderPattern.fanCommand;

import orderPattern.Command;

/**
 * Created by Younger on 2022/1/17.
 */
public class FanMiddleCommand extends FanCommand {
    @Override
    public void execute() {
        status = LEVAL;
        LEVAL = "MIDDLE";
        System.out.println("Fan is middle!");
    }
}
