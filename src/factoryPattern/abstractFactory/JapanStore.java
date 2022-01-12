package factoryPattern.abstractFactory;

/**
 * Created by Younger on 2021/12/30.
 */
public class JapanStore implements PhoneStore {
    @Override
    public void getPhone(String phoneType) {
        if ("suoni".equals(phoneType)) {
            Phone phone = new IPhone(new JapanPhoneIngredientFactory());
        } else {
            System.out.println("卖没了...");
        }
    }
}
