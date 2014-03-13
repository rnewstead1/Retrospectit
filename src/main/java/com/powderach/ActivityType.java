package com.powderach;

import static com.powderach.StringUtils.unCamel;

public enum ActivityType {
    SetTheScene,
    GatherData,
    GenerateInsights,
    DecideWhatToDo,
    CloseRetrospective
    ;

    public String getTitle() {
        return unCamel(name());
    }

}
