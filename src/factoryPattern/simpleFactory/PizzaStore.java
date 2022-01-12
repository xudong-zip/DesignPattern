package factoryPattern.simpleFactory;

/**
 * Created by Younger on 2021/12/28.
 */
public class PizzaStore {
    private Pizza pizza;
    private String pizzaType;

    public PizzaStore(String pizzaType){
        this.pizzaType = pizzaType;
    }

    public void orderPizza(){
        pizza = PizzaFactory.getPizza(pizzaType);

        System.out.println(pizza.pizzaName);

        //pizza.prepare();
        //pizza.bake();
    }

}
