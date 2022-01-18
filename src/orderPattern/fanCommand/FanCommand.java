package orderPattern.fanCommand;

import orderPattern.Command;

/**
 * Created by Younger on 2022/1/17.
 */
public abstract class FanCommand implements Command {
    public static String status = "OFF";

    public static String LEVAL = "OFF";

    @Override
    public void cancel() {
        if ("LOW".equals(status)) {
            System.out.println("LOW");
        } else if ("HIGH".equals(status)) {
            System.out.println("HIGH");
        } else if ("MIDDLE".equals(status)) {
            System.out.println("MIDDLE");
        } else {
            System.out.println("OFF");
        }
    }
}
