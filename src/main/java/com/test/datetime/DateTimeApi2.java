package com.test.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

/**
 * https://praveer09.github.io/technology/2017/03/03/practical-guide-to-java-8-s-date-time-api/
 */
public class DateTimeApi2 {

    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();

        // 2022-07-09T09:06:55.639624+02:00[Europe/Berlin]
        System.out.println(now);

        // 2022-07-09T09:07:35.333096+02:00
        System.out.println(OffsetDateTime.from(now));

        // 2022-07-09T09:08:27.358444
        System.out.println(LocalDateTime.from(now));

        // 2022-07-09
        System.out.println(LocalDate.from(now));

        // 09:09:47.245506
        System.out.println(LocalTime.from(now));

        // +02:00
        System.out.println(ZoneOffset.from(now));

        // Europe/Berlin
        System.out.println(ZoneId.from(now));

        /**
         * Conversion
         */
        System.out.println("=========Conversion========");
        System.out.println("LocalDateTime");
        LocalDateTime now1 = LocalDateTime.now();
        LocalDate localDate1 = now1.toLocalDate();
        LocalTime localTime1 = now1.toLocalTime();
        System.out.println("LocalDateTime.now().toLocalDate() = " + localDate1);
        System.out.println("LocalDateTime.now().toLocalTime() = " + localTime1);

        System.out.println("LocalDateTime");
        ZonedDateTime now2 = ZonedDateTime.now();
        LocalDate localDate2 = now2.toLocalDate();
        LocalTime localTime2 = now2.toLocalTime();
        System.out.println("ZonedDateTime.now().toLocalDate() = " + localDate2);
        System.out.println("ZonedDateTime.now().toLocalTime() = " + localTime2);

        /**
         * Conversion with additional information
         */
        System.out.println("LocalDate.now().atTime(6, 42, 19) = " + LocalDate.now().atTime(6, 42, 19));
        System.out.println("LocalDateTime.now().atOffset(ZoneOffset.UTC) = " + LocalDateTime.now().atOffset(ZoneOffset.UTC));


        /**
         * Parsing and formatting using custom formats
         */
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("MMM d yyyy hh:mm a");

// Feb 12 2017 06:42 AM
        System.out.println("LocalDateTime.now().format(pattern) = " + LocalDateTime.now().format(pattern));
        System.out.println("LocalDateTime.parse(Feb 12 2017 06:42 am, pattern) = " + LocalDateTime.parse("Feb 12 2017 06:42 am", pattern));


        LocalDate localDate = LocalDate.parse("Jul 9 2022", DateTimeFormatter.ofPattern("MMM d yyyy"));

        System.out.println("firstDayOfMonth = " + localDate.with(TemporalAdjusters.firstDayOfMonth()));

        System.out.println("lastDayOfMonth = " + localDate.with(TemporalAdjusters.lastDayOfMonth()));

        // returns the first Monday of the month i.e. 2022-07-04
        System.out.println("First monday of the month = " + localDate.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));
        System.out.println("Last Sunday of the month = " + localDate.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY)));

        // 2022-07-16
        System.out.println("Next Saturday = " + localDate.with(TemporalAdjusters.next(DayOfWeek.SATURDAY)));

        // 2022-07-09
        System.out.println("Next or same Saturday = " + localDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY)));

        System.out.println("Next Sunday = " + localDate.with(TemporalAdjusters.next(DayOfWeek.SUNDAY)));

        System.out.println("Next Sunday = " + localDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY)));

        /**
         * Adding time zone information to dates
         */

        // contains both geographical region
        // and the fixed offset based on rules
        ZoneId zoneId_1 = ZoneId.of("America/Los_Angeles");
        System.out.println("zoneId_1 = " + zoneId_1
                + ", Id=" + zoneId_1.getId()
                + ", DisplayName=" + zoneId_1.getDisplayName(TextStyle.FULL, Locale.ENGLISH));

        // contains only the fixed offset
        ZoneId zoneId_2 = ZoneId.of("-08:00");
        System.out.println("zoneId_2 = " + zoneId_2
                + ", Id=" + zoneId_2.getId()
                + ", DisplayName=" + zoneId_2.getDisplayName(TextStyle.FULL, Locale.ENGLISH));

        // contains only the fixed offset
        ZoneOffset zoneOffset = ZoneOffset.of("-08:00");
        System.out.println("zoneOffset = " + zoneOffset
                + ", Id=" + zoneOffset.getId()
                + ", DisplayName=" + zoneOffset.getDisplayName(TextStyle.FULL, Locale.ENGLISH));

        ZoneId pst = ZoneId.of("America/Los_Angeles");

// 2017-02-01T00:00-08:00[America/Los_Angeles]
        System.out.println(LocalDate.of(2022, Month.FEBRUARY, 1).atStartOfDay(pst));

// 2017-04-01T00:00-07:00[America/Los_Angeles]
        System.out.println(LocalDate.of(2022, Month.APRIL, 1).atStartOfDay(pst));

        /**
         * Epoch
         */

        // Milliseconds from epoch at the system's default time zone
        long l = Instant.now().toEpochMilli();
        System.out.println("Instant.now().toEpochMilli() = " + l);

        // 1970-01-01T00:00Z
        Instant instant = Instant.ofEpochMilli(0L);
        System.out.println("Instant.ofEpochMilli(0L) = " + instant);

        // 1970-01-01T00:00Z[UTC]
        ZonedDateTime utc = ZonedDateTime.ofInstant(Instant.EPOCH, ZoneId.of("UTC"));
        System.out.println("ZonedDateTime.ofInstant(Instant.EPOCH, ZoneId.of(\"UTC\")) = " + utc);

        // 1970-01-01T00:00
        LocalDateTime utc1 = LocalDateTime.ofInstant(Instant.EPOCH, ZoneId.of("UTC"));
        System.out.println("LocalDateTime.ofInstant(Instant.EPOCH, ZoneId.of(\"UTC\")) = " + utc1);
    }
}
