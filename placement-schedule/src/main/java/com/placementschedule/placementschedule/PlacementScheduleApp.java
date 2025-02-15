package com.placementschedule.placementschedule;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PlacementScheduleApp {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date scheduleDate = dateFormat.parse("2024-02-15");

        PlacementSchedule schedule = new PlacementSchedule(scheduleDate, "B.E", 2024);
        System.out.println("Placement Schedule:\n" + schedule);
    }
}

