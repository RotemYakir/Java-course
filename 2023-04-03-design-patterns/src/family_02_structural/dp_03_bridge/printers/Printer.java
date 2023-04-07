package family_02_structural.dp_03_bridge.printers;

import java.util.ArrayList;
import java.util.List;

import family_02_structural.dp_03_bridge.features.Feature;

public abstract class Printer {

    protected List<Feature> features = new ArrayList<>();

    public Printer(){
        uploadFeatures();
    }

    protected abstract void uploadFeatures();

    public void printTestPage(){
        String str = "This is a Test Java 150";
        System.out.println(this.getClass().getSimpleName());
        for (Feature f:features) {
            f.print(str);
        }
        System.out.println("-----------------------------------");
    }
}
