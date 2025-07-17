/**
- The class Singleton has a private constructor to prevent external instantiation.
- The getInstance() method checks if the instance is null, and if so, it enters a synchronized block.
- Within the synchronized block, it checks again if the instance is null. This is the double-checked locking mechanism.
- The volatile keyword is used to ensure that the instance variable is always read from and written to the main memory, preventing any issues with thread visibility.
- If the instance is null within the synchronized block, a new instance of the Singleton class is created.
This ensures that only one instance of the Singleton class is created and accessed across multiple threads, while also optimizing performance by only synchronizing the critical section of code when necessary.
*/

public class Singleton {
    private static volatile Singleton instance;
    
    private Singleton() {
        // Private constructor to prevent instantiation
    }
    
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    
    // Other methods and properties...
}
