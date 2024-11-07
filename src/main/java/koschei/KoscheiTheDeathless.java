package koschei;

import koschei.models.Island2;
import koschei.models.Ocean1;
import koschei.models.Wood3;
import koschei.models.Rabbit4;
import koschei.models.Duck5;
import koschei.models.Egg6;
import koschei.models.Needle7;
import koschei.models.Death8;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KoscheiTheDeathless {
    @Autowired
    private Ocean1 ocean;
    @Autowired
    private Island2 island;
    @Autowired
    private Wood3 wood;
    @Autowired
    private Rabbit4 rabbit;
    @Autowired
    private Duck5 duck;
    @Autowired
    private Egg6 egg;
    @Autowired
    private Needle7 needle;
    @Autowired
    private Death8 death;

    public String getRulesByDeth() {
        return ocean.getRules() + " " + island.getRules() + " " + wood.getRules() + " " + rabbit.getRules() + " " + duck.getRules() + " " + egg.getRules() + " " + needle.getRules() + " " + death.getRules();
    }
}