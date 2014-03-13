package com.powderach;

public class StringUtils {

    public static String unCamel(String string) {
        String[] split = string.split("(?=[A-Z])");
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : split) {
            stringBuilder.append(s).append(" ");
        }
        return stringBuilder.toString().trim();
    }
}
