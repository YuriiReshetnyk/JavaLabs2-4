package ua.lviv.iot.manager;

import java.util.List;

import ua.lviv.iot.model.Sport;

public interface ISportManager {
    List<Sport> sortByAverageDurationOfOneStage(List<Sport> sports, boolean reverse);

    List<Sport> sortByNumberOfParticipants(List<Sport> sports, boolean reverse);

    void addSport(List<Sport> sports);

    List<Sport> findByDiscipline(List<Sport> sports);

    Sport findByName(List<Sport> sports);
}
