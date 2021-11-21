package observerPattern.selfImpl;

/**
 * Created by Younger on 2021/11/11.
 */
public class InvokeC {
    public static void main(String[] args) {
        Subject subject = new Bourse();
        Investor investor = new Investor(subject);

        subject.changed(22.1f);
        subject.changed(1991.2f);
    }
}
