package Builder;

public class SubMealBuilderA extends MealBuilder {
    @Override
    public void buildDrink() {
        System.out.println("this is A drink");
    }

    @Override
    public void buildFood() {
        System.out.println("this is A food");
    }
}
