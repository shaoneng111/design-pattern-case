package AbstractFactory;

public class HaierFactory extends Factory {
    @Override
    public ProductTV createTV() {
        return new HaierTV();
    }

    @Override
    public ProductFreezer createFreezer() {
        return new HaierFreezer();
    }
}
