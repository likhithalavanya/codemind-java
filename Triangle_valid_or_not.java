import java.util.Scanner;
public class tringle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a+b>c && a+c>b && b+c>a)
        {
            System.out.printf("Valid triangle");
        }
        else
        {
            System.out.printf("Invalid triangle");
        }
    }
}