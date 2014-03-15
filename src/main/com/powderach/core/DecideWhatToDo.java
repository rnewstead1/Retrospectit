package core;

import core.utils.StringUtils;

public enum DecideWhatToDo implements Activity {
    SMARTGoals,
    ;

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
        return DescriptionReader.descriptionFor(name());
    }
}
