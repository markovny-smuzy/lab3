package Objects;

import Enums.*;
import Interfaces.Active;
import Interfaces.Attribute;
import Interfaces.Gettable;
import Interfaces.Speech;

import java.util.Objects;

public class Characters extends Obj implements Speech, Attribute, Active {

    private final String name;
    String location;
    public Characters(String name) {
        super(name);
        this.name = name;
    }



    @Override
    public void act(Action a) {
        System.out.print(this.name + " " + a.getAct());
    }

    public void AdvAct(Adverb adv, Action a) {
        System.out.print(adv.getAdv() + " " + a.getAct() + " ");
    }
    public void ActAct(Action a1, Action a2) {
        System.out.print(a1.getAct() + " " + a2.getAct());
    }
    public void nActAdv(Action a, Adverb adv) {
        System.out.print(this.name + " " + a.getAct() + " " + adv.getAdv());
    }

    public void ActAdv(Action a, Adverb adv) {
        System.out.print(a.getAct() + " " + this.name + " " + adv.getAdv());
    }

    @Override
    public void say() {
        System.out.print(this.name + " произнёс:");
    }

    @Override
    public void notSay() {
        System.out.print(this.name + "а" + " умолкнуть");
    }


    @Override
    public void sig(Sign s) {
        System.out.print(s.getSig() + " " + this.name);
    }

    public void getThrough(Gettable g, Action a) {
        System.out.print(a.getAct() + " " + g.getName());
    }
}
