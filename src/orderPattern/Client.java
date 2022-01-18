package orderPattern;

/**
 * Created by Younger on 2022/1/17.
 */
public class Client {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.getOnCommand(0).execute();
        remoteControl.getCancelCommand().cancel();

        remoteControl.getOnCommand(1).execute();
        remoteControl.getOnCommand(2).execute();
        remoteControl.getOnCommand(2).cancel();
    }
}
