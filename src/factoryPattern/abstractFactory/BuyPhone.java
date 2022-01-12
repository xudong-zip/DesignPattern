package factoryPattern.abstractFactory;

/**
 * Created by Younger on 2021/12/30.
 */
public class BuyPhone {
    public static void main(String[] args) {
        PhoneStore phoneStore = new ChinaStore();
        phoneStore.getPhone("huawei");
    }
}
