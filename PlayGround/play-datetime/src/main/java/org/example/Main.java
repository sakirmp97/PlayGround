package org.example;

import sun.lwawt.macosx.CSystemTray;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author Mohammed Sakir
 * @since ${DAY}-${MONTH}-${YEAR}
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // When storing to database, it will store the time in UTC
        System.out.println(Instant.now().getEpochSecond()); //1661405638
        // When fetching from database, it will fetch the time in specified timezone
        System.out.println(ZonedDateTime.ofInstant(Instant.ofEpochSecond(1661405638), ZoneId.of("Asia/Kolkata"))); //2022-08-25T11:03:58+05:30[Asia/Kolkata]
        System.out.println(ZonedDateTime.ofInstant(Instant.ofEpochSecond(1661405638), ZoneId.of("America/Los_Angeles"))); //2022-08-25T11:03:58+05:30[Asia/Kolkata]

        // entity.setCanceledDateUnix(model.getCancelledOn().toEpochSecond());

        // "2021-07-09T18:42:54-05:00",
        // 2022-08-25T11:03:58+05:30[Asia/Kolkata]

        // When storing to database, toEpochSecond() ,it will store the time in UTC
        ZonedDateTime zone = ZonedDateTime.parse("2022-08-25T11:03:58+05:30[Asia/Kolkata]");
        System.out.println(zone.toEpochSecond());

        zone = ZonedDateTime.parse("2022-08-24T22:33:58-07:00[America/Los_Angeles]");
        System.out.println(zone.toEpochSecond());

        zone = ZonedDateTime.parse("2022-08-25T11:03:58+05:30");
        System.out.println(zone.toEpochSecond());

        zone = ZonedDateTime.parse("2022-08-24T22:33:58-07:00");
        System.out.println(zone.toEpochSecond());

        // Storing current time in UTC for ZonedDateTime
        System.out.println(ZonedDateTime.now());
        System.out.println(ZonedDateTime.now().toEpochSecond());


    }
}