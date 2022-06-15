import java.util.Scanner;
public class LeapYear {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if ((year < 0) || (year > 9999)) {
            System.out.println("Invalid Year");
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap Year");
                } else {
                    System.out.println("Not Leap Year");
                }
            } else {
                System.out.println("Leap Year");
            }
        } else {
            System.out.println("Not Leap Year");
        }
    }
}
