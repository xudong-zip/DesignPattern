package factoryPattern.factoryMethod;

/**
 * Created by Younger on 2021/12/29.
 */
public class NanjingPizzaStore extends PizzaStore {
    @Override
    public Pizza getPizza(String pizzaType) {
        if ("Nanjingxianshuiya".equals(pizzaType)) {
            return new Pizza("Nanjingxianshuiya");
        } else if ("Nanjingmaoxuewang".equals(pizzaType)){
            return new Pizza("Nanjingmaoxuewang");
        }
        return null;
    }
}
