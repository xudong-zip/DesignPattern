package factoryPattern.abstractFactory;

/**
 * Created by Younger on 2021/12/30.
 */
public class ChinaStore implements PhoneStore{
    public void getPhone(String phoneType){
        if (phoneType.equals("huawei")) {
            Phone phone = new HuaweiPhone(new ChinaPhoneIngredientFactory());
            phone.showPhone();
        } else if (phoneType.equals("xiaomi")) {
            System.out.println("卖没了...");
        }
    }
}
