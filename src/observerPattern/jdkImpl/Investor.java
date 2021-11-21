package observerPattern.jdkImpl;

import java.util.Observable;

/**
 * Created by Younger on 2021/11/11.
 */
public class Investor implements java.util.Observer {

    public Investor(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("股价变了:" + arg);
    }
}
