package core;

import core.utils.StringUtils;

public enum GatherData implements Activity {
    MadSadGlad,
    ProudsAndSorries
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
