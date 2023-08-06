import java.util.Scanner;
public class ave{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        double c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=(float)(a+b)/2.0;
        System.out.printf("Average of %d and %d is: %.2f",a,b,c);
        sc.close();
    }
}