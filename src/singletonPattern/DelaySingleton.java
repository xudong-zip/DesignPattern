package singletonPattern;

/**
 * Created by Younger on 2022/1/12.
 */
public class DelaySingleton {
    private static DelaySingleton singleton;

    private DelaySingleton(){}

    private static DelaySingleton getSingleton(){
        if (singleton == null) {
            synchronized (DelaySingleton.class) {
                if (singleton == null) {
                    singleton = new DelaySingleton();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        DelaySingleton singleton1 = DelaySingleton.getSingleton();
        DelaySingleton singleton2 = DelaySingleton.getSingleton();

        System.out.println("是否延迟单例:" + (singleton1 == singleton2));
    }
}
