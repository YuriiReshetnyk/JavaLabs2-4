package ua.lviv.iot;

import ua.lviv.iot.model.Sport;
import ua.lviv.iot.model.SportDiscipline;

public class Main {
    public static void main(String[] args) {
        Sport sport1 = new Sport("Running for 100 meters", SportDiscipline.RUN, 8.95F, 10);
        System.out.println(sport1);
    }
}
