package decoratorPattern;

import decoratorPattern.decorator.AddCalculate;
import decoratorPattern.decorator.MultipleCalculate;
import decoratorPattern.formula.PriceScoreCalculate;

/**
 * Created by Younger on 2021/12/18.
 */
public class Client {
    public static void main(String[] args) {
        Calculate calculate = new PriceScoreCalculate();
        System.out.println("无任何浮动时:" + calculate.getResult());
        System.out.println("无任何浮动时:" + calculate.getProcess());

        calculate = new MultipleCalculate(calculate);
        System.out.println("有*浮动时:" + calculate.getResult());
        System.out.println("有*浮动时:" + calculate.getProcess());

        calculate = new AddCalculate(calculate);
        System.out.println("有+浮动时:" + calculate.getResult());
        System.out.println("有+浮动时:" + calculate.getProcess());
    }
}
