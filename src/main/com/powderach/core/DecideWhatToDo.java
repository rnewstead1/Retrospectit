package core;

public enum DecideWhatToDo implements Activity {
    SMARTGoals("For each point discussed further come up with a SMART goal. Can be done in small teams if there are lots of issues and/or people."),
    ;

    private final String description;

    DecideWhatToDo(String description) {
        this.description = description;
    }

    @Override
    public String getTitle() {
        return StringUtils.unCamel(name());
    }

    @Override
    public ActivityType getType() {
        return ActivityType.DecideWhatToDo;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
