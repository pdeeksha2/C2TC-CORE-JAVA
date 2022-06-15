import java.util.Scanner;

public class SuccessiveDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            int num = scanner.nextInt();
            if (num == 1){
                int mark = scanner.nextInt();
                if (mark >= 90) {
                    System.out.println("This is Good");
                } else if (mark >= 60) {
                    System.out.println("This is also Good");
                } else {
                    System.out.println("This is Good as well");
                }
            } else if (num == 0){
                break;
            }
        } while(true);
    }
}
