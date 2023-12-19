package Enums;

//признаки сущностей, предметов...

public enum Sign {
    Huge("Огромный"), AllRemaining("Весь оставшийся");

    private final String name;
    Sign(String name) {
        this.name = name;
    }

    public String getSig() {
        return name;
    }
}
