package SimpleFactory;

/**
 * @author shao
 * @date 18-11-6
 * @time 下午5:41
 */
public class ConcreteProductA extends Product {
    @Override
    public void use() {
        System.out.println("this is ConcreteProductA");
    }
}
