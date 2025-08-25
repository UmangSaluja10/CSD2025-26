package Package1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Ask user for input in dd/MM/yyyy format
        System.out.println("Enter your Birth Date (dd/MM/yyyy): ");
        String dob = in.next();

        // Define formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Parse input
        LocalDate birthDate = LocalDate.parse(dob, formatter);
        LocalDate today = LocalDate.now();

        // Calculate age
        Period age = Period.between(birthDate, today);
        System.out.println("Your Age: " + age.getYears() + " years, " + age.getMonths() + " months, " + age.getDays() + " days");

        // Next birthday
        LocalDate nextBirthday = birthDate.withYear(today.getYear());
        if (nextBirthday.isBefore(today) || nextBirthday.isEqual(today)) {
            nextBirthday = nextBirthday.plusYears(1);
        }

        long daysLeft = ChronoUnit.DAYS.between(today, nextBirthday);
        System.out.println("Days left for next Birthday: " + daysLeft);
    }
}
