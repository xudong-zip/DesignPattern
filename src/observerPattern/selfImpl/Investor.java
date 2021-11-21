package observerPattern.selfImpl;

/**
 * Created by Younger on 2021/11/11.
 */
public class Investor implements Observer {
    private Subject subject;
    private float sharePrice;

    public Investor(Subject subject){
        this.subject = subject;
        subject.regist(this);
    }

    @Override
    public void update(float sharePrice) {
        this.sharePrice = sharePrice;
        System.out.println("股价变了:" + sharePrice);
    }
}
