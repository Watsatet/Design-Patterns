package org.patterns.singleton;

public class Singleton {
    // Step 1: Create a private static instance of the class.
    private static Singleton instance;

    // Step 2: Make the constructor private so that this class cannot be instantiated from outside.
    private Singleton() {}

    // Step 3: Provide a public static method to get the instance of the class.
    public static Singleton createInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.createInstance();
        System.out.println(singleton1.hashCode());
        
        Singleton singleton2 = Singleton.createInstance();
        System.out.println(singleton2.hashCode());
        
//        As the hash code of both the instances is same that means both objects points to same instance
       // such that only one object is created
    }
}

