package Objects;

import Enums.*;
import Interfaces.*;

//Класс действующих и одушевленных объектов(не люди и не живые существа)

public class Acting extends Obj implements Active, Attribute, Gettable {
    private final String name;
    public Acting(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void act(Action a) {
        System.out.print(this.name + " " + a.getAct());
    }

    public void ActShoulders(Action a) {
        System.out.print(this.name + " " + a.getAct() + " с плеч");
    }

    @Override
    public void sig(Sign s) {
        System.out.print(s.getSig() + " " + this.name);
    }

    @Override
    public String getName() {
        return null;
    }
}

