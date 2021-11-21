package strategicPattern;

import strategicPattern.crowBehavior.CrowBehavior;
import strategicPattern.flyBehavior.FlyBehavior;

/**
 * Created by Younger on 2021/11/9.
 */
public class Duck {
    FlyBehavior flyBehavior;
    CrowBehavior crowBehavior;

    public void display(){
        if (flyBehavior == null) {
            System.out.println(flyBehavior);
        } else {
            flyBehavior.howFly();
        }

        if (crowBehavior == null) {
            System.out.println(crowBehavior);
        } else {
            crowBehavior.howCrow();
        }
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setCrowBehavior(CrowBehavior crowBehavior){
        this.crowBehavior = crowBehavior;
    }
}
