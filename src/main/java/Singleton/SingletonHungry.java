package Singleton;

/**
 * @author shao
 * @date 18-11-6
 * @time 下午3:49
 */

public class SingletonHungry {

    private static SingletonHungry singletonHungry = new SingletonHungry();

    private SingletonHungry() {
    }

    public static SingletonHungry getInstance() {
        return singletonHungry;
    }

}
