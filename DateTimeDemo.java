package com.aksh.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeDemo {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
//        LocalDate date = LocalDate.of(2020, 10, 25);
        LocalDate date = LocalDate.of(2020, Month.DECEMBER, 25);
        System.out.println(date);

        LocalTime curr = LocalTime.now();
        LocalTime time = LocalTime.of(10, 30, 40);
        System.out.println(curr);
        System.out.println(time);

        LocalDateTime currDateTime = LocalDateTime.now(ZoneId.of("Asia/Dhaka"));
        System.out.println(currDateTime);
        LocalDateTime dateTime = LocalDateTime.of(2018, 10, 12, 15, 30, 23);
        System.out.println(dateTime);

        // Age calculate
        LocalDate bday = LocalDate.of(1999, 9, 19);
//        LocalDate caldate = LocalDate.of(2022, 1, 1);
        LocalDate caldate = LocalDate.now();
        LocalDate futureDate = caldate.plusDays(100);
        System.out.println(caldate);

//        Period agePeriod = Period.between(bday, caldate);
        Period agePeriod = Period.between(bday, futureDate);

        System.out.println("Years " + agePeriod.getYears());
        System.out.println("Months " + agePeriod.getMonths());
        System.out.println("Days " + agePeriod.getDays());

        // other methods
        bday.format(DateTimeFormatter.BASIC_ISO_DATE);


        //https://www.hackerrank.com/challenges/java-date-and-time/problem
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();

        LocalDate localDate = LocalDate.of(year, month, day);

        System.out.println(localDate.getDayOfWeek().toString());

    }
}
