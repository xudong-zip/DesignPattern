package decoratorPattern.decorator;

import decoratorPattern.Calculate;

import java.math.BigDecimal;

/**
 * Created by Younger on 2021/12/18.
 */
public abstract class CalculateAbsDecotator extends Calculate {
    Calculate calculate = null;
    String floatType = null;
    BigDecimal floatValue = null;

    public CalculateAbsDecotator(Calculate calculate){
        this.calculate = calculate;
    }

    @Override
    public BigDecimal getResult() {
        if (this.floatType != null && this.calculate != null) {
            if (this.floatType.equals("+")) {
                return this.calculate.getResult().add(floatValue);
            }else if (this.floatType.equals("-")) {
                return this.calculate.getResult().subtract(floatValue);
            }else if (this.floatType.equals("*")) {
                return this.calculate.getResult().multiply(floatValue);
            }else if (this.floatType.equals("/")) {
                return this.calculate.getResult().divide(floatValue);
            } else if (this.floatType.equals("abs")) {
                return this.calculate.getResult().abs();
            }
        }
        return this.calculate.getResult();
    }
}
