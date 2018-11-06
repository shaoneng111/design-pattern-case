package Factory;

public class ProductAFactory extends Factory {
    @Override
    public ConcreteProductA createProduct() {
        return new ConcreteProductA();
    }
}
