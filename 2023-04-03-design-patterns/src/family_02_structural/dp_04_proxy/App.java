package family_02_structural.dp_04_proxy;

public class App {

    public static void main(String[] args) {
        Proxy machine = new Proxy();

        System.out.println(machine.toLower("Yaniv"));
        System.out.println(machine.toLower("Maor"));
        System.out.println(machine.toLower("Igor"));
        System.out.println(machine.toLower("Kobi"));
        System.out.println(machine.toLower("Kobi"));
        System.out.println(machine.toLower("Kobi"));
        System.out.println(machine.toLower("Kobi"));
        System.out.println(machine.toLower("Kobi"));
        System.out.println(machine.toLower("Kobi"));
        System.out.println(machine.toLower("Kobi"));
    }
}
