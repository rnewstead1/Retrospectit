package core;

import core.utils.StringUtils;

public enum ActivityType {
    SetTheScene,
    GatherData,
    GenerateInsights,
    DecideWhatToDo,
    CloseRetrospective
    ;

    public String getTitle() {
        return StringUtils.unCamel(name());
    }

}
