package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;

public class Island2 {
    @Autowired
    private Wood3 wood;

    public Island2(Wood3 wood) {
        this.wood = wood;
    }

    public String getRules() {
        return "на океане остров ,";
    }
}
