package factoryPattern.factoryMethod;

/**
 * Created by Younger on 2021/12/29.
 */
public abstract class PizzaStore {
    public abstract Pizza getPizza(String pizzaType);

    public void orderPizza(String pizzaName){
        System.out.println(getPizza(pizzaName).pizzaName);
    }
}
