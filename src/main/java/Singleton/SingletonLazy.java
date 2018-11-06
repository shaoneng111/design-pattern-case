package Singleton;

/**
 * @author shao
 * @date 18-11-6
 * @time 下午3:29
 */
public class SingletonLazy {

    private static SingletonLazy uniqueInstance;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonLazy();
        }
        return uniqueInstance;
    }
}
