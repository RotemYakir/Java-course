package family_01_creational.dp_01_lazily_loaded_singleton;

public class MySingleton {

    // Step 1 - create mutual static instance from the class type
    private static MySingleton instance = null;

    // Step 2 - upgrade CTOR to private access modifier
    private MySingleton() {
        System.out.println("Ha ha!");
    }

    // Step 3 - expose your one and only instance
    public static MySingleton getInstance() {
        if(instance==null){
            synchronized (MySingleton.class) {
                if(instance==null) {
                    instance = new MySingleton();
                }
            }
        }
        return instance;
    }
}
