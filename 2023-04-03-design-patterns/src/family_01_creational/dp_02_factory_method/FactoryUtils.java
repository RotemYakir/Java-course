package family_01_creational.dp_02_factory_method;

import java.util.ArrayList;
import java.util.List;

public class FactoryUtils {

    private static int count = 1;

    private static float initWeight(float min,float max){
        return (float) (Math.random()*(max-min)+min);
    }

    private static float initWeight(){
        return initWeight(5,10);
    }

    private static Cat initCat(){
        int id = count;
        String name = String.format("Mitzi %d",count++);
        float weight = initWeight();
        return new Cat(id,name,weight);
    }
    public static List<Cat> initCats(int len){
        List<Cat> cats = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            cats.add(initCat());
        }
        return cats;
    }
}