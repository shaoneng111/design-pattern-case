package Builder;

public abstract class MealBuilder {

    Meal meal;

    public abstract void buildDrink();
    public abstract void buildFood();

    public Meal getMeal() {
        return meal;
    }

}
