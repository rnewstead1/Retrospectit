package core;

public enum GenerateInsights implements Activity {
    Fishbone("Build issues from each problem in the shape of a fishbone, use the WH questions."),
    ;

    private final String description;

    GenerateInsights(String description) {
        this.description = description;
    }

    @Override
    public String getTitle() {
        return StringUtils.unCamel(name());
    }

    @Override
    public ActivityType getType() {
        return ActivityType.GenerateInsights;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
