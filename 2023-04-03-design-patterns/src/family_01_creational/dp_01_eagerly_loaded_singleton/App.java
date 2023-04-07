package family_01_creational.dp_01_eagerly_loaded_singleton;

public class App {

    static {
        System.out.println("Static and Ben El");
    }
    public static void main(String[] args) {
        System.out.println("START");
        MySingleton.getInstance();
        MySingleton.getInstance();
        MySingleton.getInstance();
        MySingleton.getInstance();
        MySingleton.getInstance();
        MySingleton.getInstance();
        MySingleton.getInstance();
        MySingleton.getInstance();

        System.out.println("END");


    }
}