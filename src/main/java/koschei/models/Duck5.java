package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Duck5 {
    @Autowired
    private Egg6 egg;

    public String getRules() {
        return "в зайце утка ,";
    }
}