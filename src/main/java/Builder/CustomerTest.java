package Builder;

public class CustomerTest {
    public static void main(String[] args) {
        KFCWaiter waiter = new KFCWaiter();
        MealBuilder mealBuilder = new SubMealBuilderA();

        waiter.setMealBuilder(mealBuilder);
        waiter.construct();
        MealBuilder ret = waiter.getResult();

        System.out.println(ret instanceof SubMealBuilderA);

    }
}
