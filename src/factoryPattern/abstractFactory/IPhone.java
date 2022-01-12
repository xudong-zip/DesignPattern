package factoryPattern.abstractFactory;

/**
 * Created by Younger on 2021/12/30.
 */
public class IPhone extends Phone {
    public IPhone(PhoneIngredientFactory factory) {
        super(factory);
    }

    @Override
    public void prepare() {
        this.camera = factory.makeCamera();
        this.battery = factory.makeBattery();
        this.mainBoard = factory.makeMainBoard();
        this.screen = factory.makeScreen();
    }
}
