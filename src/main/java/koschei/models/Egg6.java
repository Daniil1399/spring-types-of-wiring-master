package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Egg6 {

    private Needle7 need;

    @Autowired
    public Egg6(Needle7 need) {
        this.need = need;
    }


    @Override
    public String toString() {
        return ", в яйце иголка " + need.toString();
    }
}
