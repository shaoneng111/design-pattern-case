package SimpleFactory;

/**
 * @author shao
 * @date 18-11-6
 * @time 下午5:39
 */
public abstract class Product {
    public abstract void use();

    public void sale() {
        System.out.println("Product is soldout");
    }
}
