import java.util.Scanner;
public class ave{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x1,x2,y1,y2;
        double d;
        x1=sc.nextInt();
        y1=sc.nextInt();
        x2=sc.nextInt();
        y2=sc.nextInt();
        d=(float)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.printf("%.4f",d);
        sc.close();
    }
}