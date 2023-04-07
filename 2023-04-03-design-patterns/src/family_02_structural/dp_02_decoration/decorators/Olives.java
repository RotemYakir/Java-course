package family_02_structural.dp_02_decoration.decorators;

import family_02_structural.dp_02_decoration.base.Item;

public class Olives extends Item {

    private Item item;

    public Olives(Item item) {
        this.item = item;
    }

    @Override
    public double cost() {
        return this.item.cost()+2.5;
    }

    @Override
    public String description() {
        return  this.item.description()+"+Olives";
    }
}
