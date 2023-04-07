package family_02_structural.dp_02_decoration;

import family_02_structural.dp_02_decoration.base.Item;
import family_02_structural.dp_02_decoration.base.Toast;
import family_02_structural.dp_02_decoration.decorators.Corn;
import family_02_structural.dp_02_decoration.decorators.Olives;
import family_02_structural.dp_02_decoration.decorators.Tuna;

public class App {

    public static void main(String[] args) {
        Item i0 = new Toast();

        Item i1 = new Tuna(i0);
        Item i2 = new Olives(i1);
        Item i3 = new Corn(i2);


        System.out.println(i3.description());
        System.out.println(i3.cost());
    }
}