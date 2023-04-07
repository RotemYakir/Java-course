package family_01_creational.dp_01_lazily_loaded_singleton;

public class App {

    public static void main(String[] args) {

        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();



    }
}