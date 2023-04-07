package family_02_structural.dp_04_proxy;

public class Machine {

    public static double cost = 0.0;

    public String toLower(String input){
        cost+=0.1;
        System.out.println("Total cost : "+cost);
        return input.toLowerCase();
    }
}
