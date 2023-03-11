// Calendar.java

package com.mycompany.calendar;

import java.util.Scanner;

public class Calendar {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter year: ");
    int year = scanner.nextInt();

    System.out.print("Enter month (1-12): ");
    int month = scanner.nextInt();

    MonthCalendar monthCalendar = new MonthCalendar(year, month);
    monthCalendar.printMonthCalendar();
  }
}



