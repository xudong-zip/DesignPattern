package factoryPattern.abstractFactory;

/**
 * Created by Younger on 2021/12/30.
 */
public class HuaweiPhone extends Phone {
    public HuaweiPhone(PhoneIngredientFactory factory) {
        super(factory);
        this.prepare();
    }

    @Override
    public void prepare() {
        this.battery = factory.makeBattery();
        this.camera = factory.makeBattery();
        this.mainBoard = factory.makeMainBoard();
        this.screen = factory.makeScreen();
    }
}
