package Objects.Things;

import Interfaces.Gettable;
import Objects.Obj;

public class Copybook extends Obj implements Gettable {
    private String name;
    public Copybook(String name){
        super(name);
        this.name = name;
    }
    @Override
    public String getName(){
        return name;
    }
}
