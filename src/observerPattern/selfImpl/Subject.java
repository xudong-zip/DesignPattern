package observerPattern.selfImpl;

/**
 * Created by Younger on 2021/11/11.
 */
public interface Subject {
    public void regist(Observer observer);
    public void notifyA();
    public void remove(Observer observer);

    public void changed(float sharePrice);
}
