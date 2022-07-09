package com.test.datetime;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/**
 * https://howtodoinjava.com/java/date-time/zoneddatetime-vs-offsetdatetime/
 *
 */
public class ZoneAndOffsetTest {
    public static void main(String[] args) {
        ZoneOffset zoneOffset_UTC = ZoneOffset.UTC;
        System.out.println("zoneOffset_UTC = " + zoneOffset_UTC);
        System.out.println("zoneId_america.getId() = " + zoneOffset_UTC.getId());

        ZoneOffset zoneOffset_2 = ZoneOffset.of("+02:00");
        System.out.println("zoneOffset_2 = " + zoneOffset_2);
        System.out.println("zoneOffset_2.getId() = " + zoneOffset_2.getId());

        ZoneId zoneId_america = ZoneId.of("America/Los_Angeles");
        System.out.println("zoneId_america = " + zoneId_america);
        System.out.println("zoneId_america.getId() = " + zoneId_america.getId());

        /* OffsetDateTime => LocalDateTime class with the ZoneOffet */
        OffsetDateTime now = OffsetDateTime.now(ZoneOffset.UTC);
        System.out.println("OffsetDateTime now UTC = " + now);

        /* ZonedDateTime => LocalDateTime class with the ZoneId */
        ZonedDateTime now2
                = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("OffsetDateTime now America/Los_Angeles = " + now2);
    }
}
