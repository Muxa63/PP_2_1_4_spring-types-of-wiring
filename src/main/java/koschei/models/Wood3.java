package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Wood3 {
    @Autowired
    private Rabbit4 rabbit;

    public String getRules() {
        return "на острове дерево ,";
    }
}
