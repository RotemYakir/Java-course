package family_02_structural.dp_03_bridge.features;

public class TabbedFeature extends Feature{
    @Override
    public void print(String input) {
        for (char ch:input.toCharArray()) {
            System.out.print(ch+"\t");
        }
        System.out.println();
    }
}
