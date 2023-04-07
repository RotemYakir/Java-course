package family_02_structural.dp_03_bridge.features;

public class ReverseFeature extends Feature{
    @Override
    public void print(String input) {
        System.out.println(new StringBuffer(input).reverse());
    }
}