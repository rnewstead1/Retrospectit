package core;

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
