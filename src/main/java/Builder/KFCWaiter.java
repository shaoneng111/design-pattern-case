package Builder;

public class KFCWaiter {
    MealBuilder builder;

    public void construct(){
        builder.buildDrink();
        builder.buildFood();
    }

    public void setMealBuilder(MealBuilder mealBuilder){
        this.builder = mealBuilder;
    }

    public MealBuilder getResult(){
        return builder;
    }

}
