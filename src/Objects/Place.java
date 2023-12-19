package Objects;


import Enums.Adverb;
import Enums.Sign;
import Interfaces.Attribute;

public class Place extends Obj implements Attribute {
    final String name;

    public Place(String name){
        super(name);
        this.name = name;
    }


    @Override
    public void Sig(Sign s) {
        System.out.print(s.getSig() + " " + this.name);
    }

    public void getCoordinate(Adverb a) {
        System.out.print(a.getAdv() + " " + this.name);
    }

    public void getCoordinate(Sign s) {
        System.out.print(s.getSig() + " " + this.name + " ");
    }
}
