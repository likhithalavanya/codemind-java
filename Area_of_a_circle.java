import java.util.Scanner;
public class circle{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r;
        double area;
        r = sc.nextInt();
        area = 3.14*r*r;
        System.out.printf("%.2f", area);
        sc.close();
        }
}