package com.powderach;

import static com.powderach.ActivityType.GatherData;
import static com.powderach.StringUtils.unCamel;

public enum GatherData implements Activity {
    MadSadGlad("Each person takes a set of post-its and writes down things from the iteration that have made them mad, sad or glad. One item per post-it. Post-its are then collected and grouped on the board and voted on to decide what to discuss further."),
    ;

    private final String description;

    GatherData(String description) {
        this.description = description;
    }

    @Override
    public String getTitle() {
        return unCamel(name());
    }

    @Override
    public ActivityType getType() {
        return GatherData;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
