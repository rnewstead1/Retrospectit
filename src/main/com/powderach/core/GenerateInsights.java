package core;

public enum GenerateInsights implements Activity {
    Fishbone,
    ;

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
        return DescriptionReader.descriptionFor(name());
    }
}
