package family_02_structural.dp_02_decoration.decorators;

import family_02_structural.dp_02_decoration.base.Item;

public class Tuna extends Item {

    private Item item;

    public Tuna(Item item) {
        this.item = item;
    }

    @Override
    public double cost() {
        return this.item.cost()+ 3.5;
    }

    @Override
    public String description() {
        return this.item.description()+"+Tuna";
    }
}
