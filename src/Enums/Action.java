package Enums;

//действия объектов

public enum Action {
    Forced("заставил"),
    Open("открыл"),
    Become("стал"),
    Count("считать"),
    Counted("Cчитал"),
    HadTimeGetDown("успела опуститься"),
    ToRun("бежали"),
    NoToRun("не бежали"),
    Stopped("остановились"),
    FellDown("свалилась"),
    Standing("стояли");

    private String name;
    Action(String name) {
        this.name = name;
    }

    public String getAct() {
        return name;
    }
}
