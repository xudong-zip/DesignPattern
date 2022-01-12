package factoryPattern.abstractFactory;

/**
 * Created by Younger on 2021/12/30.
 * 该抽象工厂为横向工厂(一个工厂可以生产完整产品所具备的所有组件)
 */
public interface PhoneIngredientFactory {
    String makeCamera();

    String makeBattery();

    String makeScreen();

    String makeMainBoard();
}
