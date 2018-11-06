package SimpleFactory;

/**
 * @author shao
 * @date 18-11-6
 * @time 下午5:38
 */
public class SimpleProductFactory {

    static String productA = "A";
    static String productB = "B";

    public static Product createProduct(String product) {
        if (productA.equals(product)) {
            return new ConcreteProductA();
        } else if (productB.equals(product)) {
            return new ConcreteProductB();
        }
        return null;
    }

    public static void main(String[] args) {

        Product product = SimpleProductFactory.createProduct("A");
        if (product != null) {
            product.use();
        }

    }

}
