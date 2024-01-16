package Enums;

//наречия

public enum Adverb {
    WithAGlance("взглядом"),
    Long("долго"),
    SoLong("так долго, что"),
    Finally("Наконец"),
    Throught("Через"),
    Between("меж"),
    Straight("прямо"),
    AsIf("словно"),
    Silently("молча"),
    Again("снова");

    private final String name;
    Adverb(String name) {
        this.name = name;
    }

    public String getAdv() {
        return name;
    }

    public void PrintAdv(Adverb a) {
        System.out.print(a);
    }
}
