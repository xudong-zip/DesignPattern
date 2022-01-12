package factoryPattern.abstractFactory;

/**
 * Created by Younger on 2021/12/30.
 */
public abstract class Phone {

    public Phone(PhoneIngredientFactory factory){
        this.factory = factory;
    }

    PhoneIngredientFactory factory;

    String camera;

    String mainBoard;

    String screen;

    String battery;

    public abstract void prepare();

    public void showPhone(){
        System.out.println("Phone:" + camera + "," + mainBoard + "," + screen + "," + battery);
    }
}
