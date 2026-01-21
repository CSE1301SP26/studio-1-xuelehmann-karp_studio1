import java.util.Scanner;
public class Average {
public static void main(String[] args) {
    Scanner in = new Scanner (System.in); 
    System.out.println("first number?");
    int n1 = in.nextInt();
    System.out.println("second number?");
    int n2 = in.nextInt();
    System.out.println("Average of " + n1 + " and " + n2 + " is " + (n1 + n2)/2 + ".");
}
}