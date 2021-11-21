package observerPattern.verify;

/**
 * Created by Younger on 2021/11/11.
 */
public class InvokeProtected {
    private ObjectProtected objectProtected;

    public InvokeProtected(ObjectProtected objectProtected) {
        this.objectProtected = objectProtected;
    }

    //当前类如果和ObjectProtected不再同一包中，该方法报错
    public void printSucc(){
        objectProtected.printSuccess();
    }

    public static void main(String[] args) {
        InvokeProtected invokeProtected = new InvokeProtected(new ObjectProtected());
        invokeProtected.printSucc();
    }
}
