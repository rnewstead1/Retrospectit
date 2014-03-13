package com.powderach;

import static com.powderach.ActivityType.GenerateInsights;
import static com.powderach.StringUtils.unCamel;

public enum GenerateInsights implements Activity {
    Fishbone("Build issues from each problem in the shape of a fishbone, use the WH questions."),
    ;

    private final String description;

    GenerateInsights(String description) {
        this.description = description;
    }

    @Override
    public String getTitle() {
        return unCamel(name());
    }

    @Override
    public ActivityType getType() {
        return GenerateInsights;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
