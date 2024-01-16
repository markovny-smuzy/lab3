package Objects;

import java.util.Objects;

public abstract class Obj {
    String location;
    protected String name = "";
    public Obj(String name) {
        this.name = name;
    }


    public void printName() {
        System.out.print(name);
    }

    @Override
    public String toString() {
        return name;
    }

    public void setLocation(String location){
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Characters that = (Characters) o;
        return Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Obj object = (Obj) o;
//        return Objects.equals(name, object.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return name.hashCode();
//    }
}
