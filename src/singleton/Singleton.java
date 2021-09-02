package singleton;

public class Singleton {

    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getSingleton() {

        if (singleton == null) { // double checked locking
            synchronized (Singleton.class) { // thread safe
                if (singleton == null) { // lazy loading
                    singleton = new Singleton();
                }
            }
        }

        return singleton;
    }
}
