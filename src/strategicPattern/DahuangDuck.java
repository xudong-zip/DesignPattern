package strategicPattern;

import strategicPattern.crowBehavior.CanNotCrow;
import strategicPattern.crowBehavior.CrazyCrow;
import strategicPattern.crowBehavior.CrowBehavior;
import strategicPattern.flyBehavior.ButterFly;
import strategicPattern.flyBehavior.FlyBehavior;

/**
 * Created by Younger on 2021/11/9.
 */
public class DahuangDuck extends Duck {
    public DahuangDuck() {
    }

    public DahuangDuck(FlyBehavior flyBehavior, CrowBehavior crowBehavior) {
        this.crowBehavior = crowBehavior;
        this.flyBehavior = flyBehavior;
    }

    public static void main(String[] args) {
        DahuangDuck dahuangDuck = new DahuangDuck(new ButterFly(), new CrazyCrow());
        dahuangDuck.display();

        dahuangDuck.setCrowBehavior(new CanNotCrow());
        dahuangDuck.display();

        DahuangDuck dahuangDuck2 = new DahuangDuck();
        dahuangDuck2.display();

        /*  成员属性可以不进行初始化;
            非成员属性在使用前必须进行初始化;
            但是在使用前申明和初始化的步骤可以分开;
        DahuangDuck dahuangDuck3 =  null;
        kq(dahuangDuck3);*/

        /*数据类型转换：整型运算返回整型;整型和长整形运算返回长整型;整型或者长整型与浮点相乘,返回浮点类型*/
        /*运算结果为长整型，且结果并没有超过整型的范围，则长整型转换为整型前后数值相同*/
        /*long a = Long.valueOf(21999L + 1L);
        System.out.println(a);*/
    }
}
