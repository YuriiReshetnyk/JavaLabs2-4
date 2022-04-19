package ua.lviv.iot.model;

public record Sport(String name, SportDiscipline discipline, float averageDurationOfOneStage,
        int maximumNumberOfSimultaneousParticipants) {

}
