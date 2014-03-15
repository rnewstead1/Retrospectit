package core;

public enum GatherData implements Activity {
    MadSadGlad,
    ;

    @Override
    public String getTitle() {
        return StringUtils.unCamel(name());
    }

    @Override
    public ActivityType getType() {
        return ActivityType.GatherData;
    }

    @Override
    public String getDescription() {
        return DescriptionReader.descriptionFor(name());
    }
}
