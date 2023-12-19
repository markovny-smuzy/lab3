/*Текст:
    Огромный Хемуль, взглядом заставил Снусмумрика умолкнуть, открыл тетрадь и стал считать.
    Считал он долго, так долго, что вода успела опуститься до его лодыжек.
    Наконец Хемуль произнес: Весь оставшийся путь они бежали.
    Через вершину холма, меж кустов сирени и прямо к крыльцу.
    Там они остановились, и у них словно гора свалилась с плеч.
    Они стояли молча, чувствуя, что снова дома.
 */

import Enums.Action;
import Enums.Adverb;
import Enums.Sign;
import Objects.Acting;
import Objects.Characters;
import Objects.Place;
import Objects.Things.Ankles;
import Objects.Things.Copybook;

public class Main {
    public static void main(String[] args) {
        //действующие лица
        Characters hemul = new Characters("Хемуль");
        Characters snusmumrik = new Characters("Снусмумрик");
        Characters they = new Characters("они");
        Characters he = new Characters("он");

        //одушевленные
        Acting water = new Acting("вода");
        Acting mountain = new Acting("гора");

        //предметы
        Copybook copybook = new Copybook("тетрадь");
        Ankles ankles = new Ankles("лодыжек");

        //места
        Place way = new Place("путь");
        Place topOfTheHill = new Place("вершину холма");
        Place lilacbushes = new Place("кустов сирени");
        Place porch = new Place("к крылцу");
        Place home = new Place("дома");


        // 1 Огромный Хемуль, взглядом заставил Снусмумрика умолкнуть, открыл тетрадь и стал считать.
        hemul.Sig(Sign.Huge);
        System.out.print(", ");
        hemul.AdvAct(Adverb.WithAGlance, Action.Forced);
        snusmumrik.NotSay();
        System.out.print(", ");
        hemul.getThrough(copybook, Action.Open);
        System.out.print(" и ");
        hemul.ActAct(Action.Become, Action.Count);
        System.out.print(".\n");

        // 2 Считал он долго, так долго, что вода успела опуститься до его лодыжек.
        he.ActAdv(Action.Counted, Adverb.Long);
        System.out.print(", так долго, что ");
        water.Act(Action.HadTimeGetDown);
        System.out.print(" до его ");
        ankles.printName();
        System.out.print(".\n");

        // 3 Наконец Хемуль произнес:
        System.out.print("Наконец ");
        hemul.Say();
        System.out.print(".\n");

        // Весь оставшийся путь они бежали.
        way.getCoordinate(Sign.AllRemaining);
        they.Act(Action.ToRun);
        System.out.print(".\n");


        // 4 Через вершину холма, меж кустов сирени и прямо к крыльцу.
        topOfTheHill.getCoordinate(Adverb.Throught);
        System.out.print(", ");
        lilacbushes.getCoordinate(Adverb.Between);
        System.out.print(" и ");
        porch.getCoordinate(Adverb.Straight);
        System.out.print(".\n");

        // 5 Там они остановились, и у них словно гора свалилась с плеч.
        System.out.print("Там ");
        they.Act(Action.Stopped);
        System.out.print(", и у них словно ");
        mountain.ActShoulders(Action.FellDown);
        System.out.print(".\n");

        // 6 Они стояли молча, чувствуя, что снова дома.
        they.nActAdv(Action.Standing, Adverb.Silently);
        System.out.print(", чувствуя, что ");
        home.getCoordinate(Adverb.Again);
        System.out.print(".\n");
    }
}