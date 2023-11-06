package DesignPatterns._CreationalPatterns.Singleton;

public class Singleton {
    public static Singleton singleton;

    public Singleton() {
        System.out.println("ben oluştum");

    }

    public static Singleton getSingleton() {

        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }

            }

        }

        return singleton;
    }
}
