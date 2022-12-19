package com.SwitchExpression;

import java.time.DayOfWeek;

import static java.time.DayOfWeek.*;

public class switch_expression {
    public static void main(String[] args) {
        getChowdhury(WEDNESDAY);
        getChowdhury(MONDAY);
        getChowdhury(FRIDAY);
        getChowdhury(TUESDAY);
        getChowdhury(SATURDAY);

    }
    public static void getChowdhury(DayOfWeek chowdhury){
        int result = switch(chowdhury){

            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY                -> 7;
            case THURSDAY, SATURDAY     -> 8;
            case WEDNESDAY              -> 9;
            default -> throw new IllegalStateException("Invalid day: " + chowdhury);
        };
        System.out.println(result);
    }
}
