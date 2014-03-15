package core;

public enum CloseRetrospective implements Activity {
    ReturnOnTimeInvested,
    ;

    @Override
    public String getTitle() {
        return StringUtils.unCamel(name());
    }

    @Override
    public ActivityType getType() {
        return ActivityType.CloseRetrospective;
    }

    @Override
    public String getDescription() {
        return DescriptionReader.descriptionFor(name());
    }
}
