import java.util.Scanner;
public class grades{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int p,c,b,m,cs,per;
        p=sc.nextInt();
        c=sc.nextInt();
        b=sc.nextInt();
        m=sc.nextInt();
        cs=sc.nextInt();
        per=(p+c+b+m+cs)/5;
        if(per>=90)
        {
            System.out.printf("Grade A");
        }
        else if(per>=80)
        {
            System.out.printf("Grade B");
        }
        else if(per>=70)
        {
            System.out.printf("Grade C");
        }
        else if(per>=60)
        {
            System.out.printf("Grade D");
        }
        else if(per>=40)
        {
            System.out.printf("Grade E");
        }
        else
        {
            System.out.printf("Grade F");
        }
    }
}