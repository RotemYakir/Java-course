package family_02_structural.dp_03_bridge.printers;

import family_02_structural.dp_03_bridge.features.LowerFeature;
import family_02_structural.dp_03_bridge.features.RegularFeature;
import family_02_structural.dp_03_bridge.features.ReverseFeature;
import family_02_structural.dp_03_bridge.features.TabbedFeature;
import family_02_structural.dp_03_bridge.features.UpperFeature;

public class DeluxPrinter extends Printer{
    @Override
    protected void uploadFeatures() {
        this.features.add(new RegularFeature());
        this.features.add(new UpperFeature());
        this.features.add(new LowerFeature());
        this.features.add(new ReverseFeature());
        this.features.add(new TabbedFeature());
    }
}
