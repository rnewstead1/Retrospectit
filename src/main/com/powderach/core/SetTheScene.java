package core;

public enum SetTheScene implements Activity {
    ExplorerShopperVacationerPrisoner("Each person writes a letter on a piece of paper to represent which position they are taking at the start of the retrospective. Answers are kept anonymous and totalled as a histogram to ascertain the mood of the group."),
    ;
    private final String description;

    SetTheScene(String description) {
        this.description = description;
    }

    @Override
    public String getTitle() {
        return StringUtils.unCamel(name());
    }

    @Override
    public ActivityType getType() {
        return ActivityType.SetTheScene;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
