import java.util.Scanner;
public class trap{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int b1,b2,h;
        double area;
        b1=sc.nextInt();
        b2=sc.nextInt();
        h=sc.nextInt();
        area=((b1+b2)/2.0)*h;
        System.out.printf("%.4f",area);
        sc.close();
    }
}