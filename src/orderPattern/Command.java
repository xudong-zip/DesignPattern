package orderPattern;

/**
 * Created by Younger on 2022/1/17.
 */
public interface Command {

    public void execute();

    public void cancel();
}
