package DesignPatterns;

public class Singleton {

    private static Singleton single;
    // private static Singleton single=new Singleton(); // object creation when
    // class is loaded eager loading

    private Singleton() {

    }

    // multithreading safe
    public static Singleton getObject() {
        if (single == null) {
            synchronized (Singleton.class) {
                if (single == null)
                    single = new Singleton();
            }
        } // lazy loading at the time when i called the method;
        return single;
    }
}
