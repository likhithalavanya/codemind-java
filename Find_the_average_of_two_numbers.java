import java.util.Scanner;
public class ave{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        double average;
        a = sc.nextInt();
        b = sc.nextInt();
        average=(a+b)/2.0;
        System.out.printf("%.4f",average );
        sc.close();
        }
}