import java.util.Scanner;
public class rj{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x,y,z,n;
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        n=(5*x+10*y)/z;
        System.out.printf("%d",n);
        sc.close();
    }
}