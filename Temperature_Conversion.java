import java.util.Scanner;
public class tri{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c;
        double f;
        c = sc.nextInt();
        f=32+(c*1.8);
        System.out.printf("%.2f", f);
        sc.close();
        }
}