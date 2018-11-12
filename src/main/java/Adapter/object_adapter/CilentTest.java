package Adapter.object_adapter;

public class CilentTest {


    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.request();
    }
}
