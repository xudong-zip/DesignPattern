package orderPattern.fanCommand;

import orderPattern.Command;

/**
 * Created by Younger on 2022/1/17.
 */
public class FanLowCommand extends FanCommand {
    @Override
    public void execute() {
        status = LEVAL;
        LEVAL = "LOW";
        System.out.println("Fan is low!");
    }
}
