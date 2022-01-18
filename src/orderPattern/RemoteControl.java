package orderPattern;

import orderPattern.fanCommand.FanHighCommand;
import orderPattern.fanCommand.FanLowCommand;
import orderPattern.fanCommand.FanMiddleCommand;
import orderPattern.fanCommand.FanOffCommand;
import orderPattern.lightCommand.LightOffCommand;
import orderPattern.lightCommand.LightOnCommand;

/**
 * Created by Younger on 2022/1/17.
 */
public class RemoteControl {
    private Command[] onCommands = new Command[7];
    private Command[] offCommands = new Command[7];
    private Command cancelCommand = new NoCommand();

    public RemoteControl() {

        //给命令数组初始化一个空命令
        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }

        //set light command
        initCommand();

        //set fan command
        initFanCommand();
    }

    private void initFanCommand() {
        Command fanLowCommand = new FanLowCommand();
        Command fanHighCommand = new FanHighCommand();
        Command fanMiddleCommand = new FanMiddleCommand();
        Command fanOffCommand = new FanOffCommand();

        onCommands[1] = fanLowCommand;
        onCommands[2] = fanMiddleCommand;
        onCommands[3] = fanHighCommand;
        offCommands[1] = fanOffCommand;
        offCommands[2] = fanOffCommand;
        offCommands[3] = fanOffCommand;
    }

    private void initCommand() {
        Command lightOnCommand = new LightOnCommand();
        Command lightOffCommand = new LightOffCommand();

        onCommands[0] = lightOnCommand;
        offCommands[0] = lightOffCommand;
    }

    public Command getOnCommand(int pos) {
        cancelCommand = onCommands[pos];
        return onCommands[pos];
    }

    public Command getOffCommand(int pos) {
        cancelCommand = offCommands[pos];
        return offCommands[pos];
    }

    public Command getCancelCommand() {
        return cancelCommand;
    }
}
