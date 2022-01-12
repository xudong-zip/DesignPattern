package factoryPattern.abstractFactory;

/**
 * Created by Younger on 2021/12/30.
 */
public class JapanPhoneIngredientFactory implements PhoneIngredientFactory {
    @Override
    public String makeCamera() {
        return "佳能";
    }

    @Override
    public String makeBattery() {
        return "东芝";
    }

    @Override
    public String makeScreen() {
        return "三星";
    }

    @Override
    public String makeMainBoard() {
        return "索尼";
    }
}
