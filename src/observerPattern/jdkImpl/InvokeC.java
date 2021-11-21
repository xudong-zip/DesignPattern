package observerPattern.jdkImpl;

import observerPattern.selfImpl.Subject;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Younger on 2021/11/11.
 */
public class InvokeC {
    public static void main(String[] args) {
        Bourse subject = new Bourse();
        new Investor(subject);

        subject.exchange(22.1f);
        subject.exchange(1991.2f);
    }
}
