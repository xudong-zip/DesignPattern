package factoryPattern.factoryMethod;

/**
 * Created by Younger on 2021/12/29.
 */
public class BuyPizza {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NanjingPizzaStore();
        pizzaStore.orderPizza("Nanjingmaoxuewang");
    }
}
