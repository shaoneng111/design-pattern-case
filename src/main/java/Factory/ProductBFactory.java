package Factory;

public class ProductBFactory extends Factory {

    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
