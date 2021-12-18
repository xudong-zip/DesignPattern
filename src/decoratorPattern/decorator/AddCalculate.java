package decoratorPattern.decorator;

import decoratorPattern.Calculate;

import java.math.BigDecimal;

/**
 * Created by Younger on 2021/12/18.
 */
public class AddCalculate extends CalculateAbsDecotator {

    public AddCalculate(Calculate calculate) {
        super(calculate);
        calculate = calculate;
        floatType = "+";
        floatValue = new BigDecimal(20);
    }

    @Override
    public String getProcess() {
        return calculate.getProcess().concat("增加+浮动 " + floatValue + ";");
    }
}
