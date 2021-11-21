package strategicPattern.flyBehavior;

/**
 * Created by Younger on 2021/11/9.
 */
public class CanNotFly implements FlyBehavior {
    @Override
    public void howFly() {
        System.out.println("can not fly...");
    }
}
