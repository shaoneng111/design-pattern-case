package Adapter.class_adapter;

public class ClientTest {
    public static void main(String[] args) {
        Target adapter = new Adapter();
        adapter.request();
    }
}
