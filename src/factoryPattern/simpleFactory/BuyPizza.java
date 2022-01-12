package factoryPattern.simpleFactory;

/**
 * Created by Younger on 2021/12/29.
 */
public class BuyPizza {
    public static void main(String[] args) {
        PizzaStore pizzaOrder = new PizzaStore("liulianPizza");
        pizzaOrder.orderPizza();
    }

}
