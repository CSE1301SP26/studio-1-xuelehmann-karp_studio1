package studio1;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.println("enter a year");
    int y = in.nextInt(); 
    boolean divisibleBy4 = (y % 4 == 0);
    boolean notDivisibleBy100 = (y % 100 != 0);
    boolean divisibleBy400 = (y % 400 == 0);
    boolean isALeapYear = (divisibleBy4 && notDivisibleBy100 || divisibleBy400);
    System.out.println(y + " is a leap year: " + isALeapYear);
    }

}
