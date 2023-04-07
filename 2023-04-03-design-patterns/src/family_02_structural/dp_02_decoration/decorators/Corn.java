package family_02_structural.dp_02_decoration.decorators;

import family_02_structural.dp_02_decoration.base.Item;

public class Corn extends Item {

    private Item item;

    public Corn(Item item) {
        this.item = item;
    }

    @Override
    public double cost() {
        return this.item.cost()+ 4;
    }

    @Override
    public String description() {
        return this.item.description()+"+Corn";
    }
}