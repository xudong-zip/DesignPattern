package factoryPattern.simpleFactory;


/**
 * Created by Younger on 2021/12/28.
 */
public class PizzaFactory {
    public static Pizza getPizza(String pizzaType) {
        if ("liulianPizza".equals(pizzaType)){
            return new LiulianPizza();
        } else if ("hashiqiPizza".equals(pizzaType)) {
            return new HashiqiPizza();
        } else {
            return null;
        }
    }
}
