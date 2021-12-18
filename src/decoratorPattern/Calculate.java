package decoratorPattern;

import java.math.BigDecimal;

/**
 * Created by Younger on 2021/12/18.
 */
public abstract class Calculate {
    public abstract BigDecimal getResult();

    public abstract String getProcess();
}
