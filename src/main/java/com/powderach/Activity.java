package com.powderach;

import static com.powderach.ActivityType.*;

public enum Activity {
    ESVP("Explorer, Shopper, Vacationer, Prisoner", SetTheScene, "Each person writes a letter on a piece of paper to represent which position they are taking at the start of the retrospective. Answers are kept anonymous and totalled as a histogram to ascertain the mood of the group."),
    MadSadGlad("Mad, Sad, Glad", GatherData, "Each person takes a set of post-its and writes down things from the iteration that have made them mad, sad or glad. One item per post-it. Post-its are then collected and grouped on the board and voted on to decide what to discuss further."),
    Fishbone("Fishbone", GenerateInsights, "Build issues from each problem in the shape of a fishbone, use the WH questions."),
    SMARTGoals("SMART Goals", DecideWhatToDo, "For each point discussed further come up with a SMART goal. Can be done in small teams if there are lots of issues and/or people."),
    ROTI("Return On Time Invested", CloseRetrospective, "Everyone votes on a scale of 0 - 4 where 0 is no benefit for the time invested, 2 is breaking even, and 4 is greater benefit received than the time invested."),
    ;
    private final String title;
    private final ActivityType type;
    private final String description;

    private Activity(String title, ActivityType type, String description) {
        this.title = title;
        this.type = type;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public ActivityType getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}
