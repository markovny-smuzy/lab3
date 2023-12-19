package Objects;

import java.util.Objects;

public abstract class Obj {
    protected String name = "";
    public Obj(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.print(name);
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obj object = (Obj) o;
        return Objects.equals(name, object.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
