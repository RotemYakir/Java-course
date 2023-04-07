package family_02_structural.dp_02_decoration.base;

public class Coffee extends Item{
    @Override
    public double cost() {
        return 10.0;
    }

    @Override
    public String description() {
        return "Coffee";
    }
}
