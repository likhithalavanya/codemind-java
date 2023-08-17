import java.util.Scanner;
public class triangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a==b && b==c)
        {
            System.out.printf("Equilateral triangle");
        }
        else if(a==b || a==c || b==c)
        {
            System.out.printf("Isosceles triangle");
        }
        else
        {
            System.out.printf("Scalene triangle");
        }
    }
}