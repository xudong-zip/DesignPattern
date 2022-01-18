package orderPattern.fanCommand;

/**
 * Created by Younger on 2022/1/17.
 */
public class FanHighCommand extends FanCommand {
    @Override
    public void execute() {
        status = LEVAL;
        LEVAL = "HIGH";
        System.out.println("Fan is high!");
    }

}
