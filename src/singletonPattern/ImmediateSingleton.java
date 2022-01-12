package singletonPattern;

/**
 * Created by Younger on 2022/1/12.
 */
public class ImmediateSingleton {
    private static ImmediateSingleton testClass = new ImmediateSingleton();

    private ImmediateSingleton(){}

    public static ImmediateSingleton getSingle() {
        return testClass;
    }

    public static void main(String[] args) {
        ImmediateSingleton singleton1 = getSingle();
        ImmediateSingleton singleton2 = getSingle();

        System.out.println("是否即时式单例:" + (singleton1 == singleton2));
    }
}
