package com.powderach;

public enum ActivityType {
    SetTheScene,
    GatherData,
    GenerateInsights,
    DecideWhatToDo,
    CloseRetrospective
    ;

    public String getTitle() {
        return unCamel(name());
    }

    private String unCamel(String string) {
        String[] split = string.split("(?=[A-Z])");
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : split) {
            stringBuilder.append(s).append(" ");
        }
        return stringBuilder.toString().trim();
    }
}
