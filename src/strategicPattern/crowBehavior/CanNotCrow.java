package strategicPattern.crowBehavior;

/**
 * Created by Younger on 2021/11/9.
 */
public class CanNotCrow implements CrowBehavior {
    @Override
    public void howCrow() {
        System.out.println("can not crow...");
    }
}
