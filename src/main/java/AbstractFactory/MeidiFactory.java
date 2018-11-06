package AbstractFactory;

public class MeidiFactory extends Factory {
    @Override
    public ProductTV createTV() {
        return new MeidiTV();
    }

    @Override
    public ProductFreezer createFreezer() {
        return new MeidiFreezer();
    }
}
