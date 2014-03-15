package core;

import java.io.File;

public enum CloseRetrospective implements Activity {
    ReturnOnTimeInvested,
    ;
    private final DescriptionReader descriptionReader;

    CloseRetrospective() {
        this.descriptionReader = new DescriptionReader(new File("../retrospectit/src/main/com/powderach/core/descriptions"));
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
        return descriptionReader.descriptionFor(name());
    }
}
