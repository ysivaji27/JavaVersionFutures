package com.java8.time;

// Java code for LocalDate
// / LocalTime Function

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateSample {

    public static void LocalDateTimeApi() {

        // the current date
        LocalDate date = LocalDate.now();
        System.out.println("the current date is " + date);

        // the current time
        LocalTime time = LocalTime.now();
        System.out.println("the current time is " + time);

        // will give us the current time and date
        LocalDateTime current = LocalDateTime.now();
        System.out.println("current date and time : " + current);

        // to print in a particular format
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formatedDateTime = current.format(format);

        System.out.println("in formatted manner " + formatedDateTime);

        // printing months days and seconds
        Month month = current.getMonth();
        int day = current.getDayOfMonth();
        int seconds = current.getSecond();
        System.out.println("Month : " + month + " day : " + day + " seconds : " + seconds);

        // printing some specified date
        LocalDate date2 = LocalDate.of(1950, 1, 26);
        System.out.println("the republic day :" + date2);

        // printing date with current time.
        LocalDateTime specificDate = current.withDayOfMonth(24).withYear(2016);

        System.out.println("specific date with " + "current time : " + specificDate);
    }

    // Function to get Zoned Date and Time
    public static void ZonedTimeAndDate() {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedCurrentDate = date.format(format1);

        System.out.println("formatted current Date and" + " Time : " + formattedCurrentDate);

        // to get the current zone
        ZonedDateTime currentZone = ZonedDateTime.now();
        System.out.println("the current zone is " + currentZone.getZone());

        // getting time zone of specific place
        // we use withZoneSameInstant(): it is
        // used to return a copy of this date-time
        // with a different time-zone,
        // retaining the instant.
        ZoneId tokyo = ZoneId.of("Asia/Tokyo");

        ZonedDateTime tokyoZone = currentZone.withZoneSameInstant(tokyo);

        System.out.println("tokyo time zone is " + tokyoZone);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formatedDateTime = tokyoZone.format(format);

        System.out.println("formatted tokyo time zone " + formatedDateTime);

    }

    public static void checkingPeriod()
    {
        LocalDate date1 = LocalDate.now();

        LocalDate date2 =
                LocalDate.of(2014, Month.DECEMBER, 12);

        Period gap = Period.between(date2, date1);
        System.out.println("gap between dates  is a period of : "+gap);
    }

    // Function to check duration
    public static void checkingDuration()
    {

        LocalTime time1 = LocalTime.now();
        System.out.println("the current time is " + time1);

        Duration fiveHours = Duration.ofHours(5);

        // adding five hours to the current
        // time and storing it in time2
        LocalTime time2 = time1.plus(fiveHours);

        System.out.println("after adding five hours of duration " + time2);

        Duration gap = Duration.between(time2, time1);
        System.out.println("duration gap between time1 & time2 is " + gap);
    }


    // Driver code
    public static void main(String[] args) {
        LocalDateTimeApi();
        System.out.println("-------------------------------------------------");
        ZonedTimeAndDate();
        System.out.println("-------------------------------------------------");
        checkingPeriod();
        System.out.println("-------------------------------------------------");
        checkingDuration();
    }
}
