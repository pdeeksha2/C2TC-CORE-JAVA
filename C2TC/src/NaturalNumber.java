import java.util.*;
public class NaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int i= sc.nextInt();
        int n= sc.nextInt();

        int sum=0;
        for(i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }

}
