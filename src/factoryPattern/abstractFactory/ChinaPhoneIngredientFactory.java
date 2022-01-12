package factoryPattern.abstractFactory;

/**
 * Created by Younger on 2021/12/30.
 */
public class ChinaPhoneIngredientFactory implements PhoneIngredientFactory {
    @Override
    public String makeCamera() {
        return "爱国者";
    }

    @Override
    public String makeBattery() {
        return "比亚迪";
    }

    @Override
    public String makeScreen() {
        return "京东方";
    }

    @Override
    public String makeMainBoard() {
        return "华为";
    }
}
