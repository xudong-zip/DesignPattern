package decoratorPattern.formula;

import decoratorPattern.Calculate;

import java.math.BigDecimal;

/**
 * Created by Younger on 2021/12/18.
 */
public class PriceScoreCalculate extends Calculate {

    //计算公式  RESULT = (1 - A(1 - 0.3)) * 100
    @Override
    public BigDecimal getResult() {
        return new BigDecimal((1 - (1 - 0.3)) * 100).setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    @Override
    public String getProcess() {
        return "先使用公式：RESULT = (1 - A(1 - 0.3)) * 100 进行计算.";
    }
}
