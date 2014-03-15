package core;

public enum SetTheScene implements Activity {
    ExplorerShopperVacationerPrisoner,
    ;

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
        return DescriptionReader.descriptionFor(name());
    }
}
