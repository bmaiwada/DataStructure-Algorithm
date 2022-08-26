package datastructures;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateDemo {



    public static void main(String[] args) {

        LocalDate orderDate = LocalDate.of(2020, Month.JANUARY, 12);

        LocalTime orderTime = LocalTime.of(12, 12, 12);

        LocalDate dispacthDate = orderDate.plusMonths(1).plusWeeks(7).plusDays(9);

        LocalTime dispacthTime = orderTime.MIDNIGHT.plusHours(1);

        System.out.println("Your Order has been dispatched on "+dispacthDate+ " at "+dispacthTime);

    }



}