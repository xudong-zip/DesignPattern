package observerPattern.selfImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Younger on 2021/11/11.
 */
public class Bourse implements Subject {
    private float sharePrice;
    private Boolean flag;

    List<Observer> observerList = new ArrayList();
    @Override
    public void regist(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void notifyA() {
        observerList.stream().forEach(
                (e) -> {
                    e.update(sharePrice);
                }
        );
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void changed(float sharePrice) {
        this.sharePrice = sharePrice;
        this.notifyA();
    }
}
