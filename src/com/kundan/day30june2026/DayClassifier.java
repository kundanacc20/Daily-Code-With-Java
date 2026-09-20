package com.kundan.day30june2026;

public class DayClassifier {
    public static String classifyDay(Day day){
        return switch (day){
            case MONDAY, FRIDAY -> "workday";
            case SATURDAY, SUNDAY -> "weekend";
            default -> "Midweek";
        };
    }
}
