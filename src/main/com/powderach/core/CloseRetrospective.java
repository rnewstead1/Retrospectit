package core;

public enum CloseRetrospective implements Activity {
    ReturnOnTimeInvested("Everyone votes on a scale of 0 - 4 where 0 is no benefit for the time invested, 2 is breaking even, and 4 is greater benefit received than the time invested."),
    ;

    private final String description;

    CloseRetrospective(String description) {
        this.description = description;
    }

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
        return description;
    }
}
