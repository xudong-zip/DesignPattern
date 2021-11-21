package observerPattern.jdkImpl;

import java.util.Observable;

/**
 * Created by Younger on 2021/11/11.
 */
public class Bourse extends Observable {
    private float sharePrice;

    public void exchange(float sharePrice){
        this.sharePrice = sharePrice;
        setChanged();
        this.notifyObservers(sharePrice);
    }
}
