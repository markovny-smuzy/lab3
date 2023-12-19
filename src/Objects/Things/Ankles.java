package Objects.Things;

import Interfaces.Gettable;
import Objects.Obj;

public class Ankles extends Obj implements Gettable {
    private String name;
    public Ankles(String name){
        super(name);
        this.name = name;
    }
    @Override
    public String getName(){
        return name;
    }
}
