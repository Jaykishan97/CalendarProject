// MonthCalendar.java

package com.mycompany.calendar;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MonthCalendar {
  private int year;
  private int month;

  public MonthCalendar(int year, int month) {
    this.year = year;
    this.month = month;
  }

  public void printMonthCalendar() {
    LocalDate date = LocalDate.of(year, month, 1);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM yyyy");

    System.out.println(formatter.format(date));
    System.out.println("Sun Mon Tue Wed Thu Fri Sat");

    int daysInMonth = date.lengthOfMonth();
    int dayOfWeek = date.getDayOfWeek().getValue();

    for (int i = 1; i < dayOfWeek; i++) {
      System.out.print("    ");
    }

    for (int i = 1; i <= daysInMonth; i++) {
      System.out.printf("%3d ", i);

      if ((i + dayOfWeek - 1) % 7 == 0 || i == daysInMonth) {
        System.out.println();
      }
    }
  }
}