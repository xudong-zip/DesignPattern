package factoryPattern.factoryMethod;

/**
 * Created by Younger on 2021/12/29.
 */
public class BeijingPizzaStore extends PizzaStore {
    @Override
    public Pizza getPizza(String pizzaType) {
        if ("BeijingKaoya".equals(pizzaType)) {
            return new Pizza("BeijingKaoya");
        } else if ("Gongbaojiding".equals(pizzaType)){
            return new Pizza("Gongbaojiding");
        }
        return null;
    }
}
