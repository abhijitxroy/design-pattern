package abstractfactorymethoddp;

/**
 * Singleton Class
 */
public class Singleton {

    private static volatile Singleton INSTANCE = new Singleton();;

    private Singleton(){}
    
    public static Singleton getInstance() {
        return INSTANCE;
    }
}
