package com.powderach;

public enum ActivityType {
    SetTheScene,
    GatherData,
    GenerateInsights,
    DecideWhatToDo,
    CloseRetrospective
    ;

    public String getTitle() {
        return name();
    }
}
