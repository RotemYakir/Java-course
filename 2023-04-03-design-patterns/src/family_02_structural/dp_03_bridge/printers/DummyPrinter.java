package family_02_structural.dp_03_bridge.printers;

import family_02_structural.dp_03_bridge.features.RegularFeature;

public class DummyPrinter extends Printer{
    @Override
    protected void uploadFeatures() {
        this.features.add(new RegularFeature());
    }
}
