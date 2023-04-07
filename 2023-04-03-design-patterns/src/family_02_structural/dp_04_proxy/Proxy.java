package family_02_structural.dp_04_proxy;

import java.util.HashMap;
import java.util.Map;

public class Proxy {

    private Machine machine = new Machine();
    private Map<String,String> cache = new HashMap<>();

    public String toLower(String input){
        String value = cache.get(input);
        if(value==null){
            cache.put(input,machine.toLower(input));
        }
        return cache.get(input);
    }
}
