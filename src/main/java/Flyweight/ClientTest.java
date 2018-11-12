package Flyweight;

public class ClientTest {

    public static void main(String[] args) {
        FlyweightFactory factory = FlyweightFactory.getInstance();
        factory.getFlyweight("abc").opration("abc");

        factory.getFlyweight("kfc").opration("kfc");
        factory.getFlyweight("abc").opration("abc");

    }
}
