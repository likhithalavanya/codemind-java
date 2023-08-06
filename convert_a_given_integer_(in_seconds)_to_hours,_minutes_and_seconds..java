import java.util.Scanner;
public class ave{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sec,s,h,m;
        sec=sc.nextInt();
        h=(sec/3600);
        m=(sec-(3600*h))/60;
        s=(sec-(3600*h)-(m*60));
        System.out.printf("H:M:S-%d:%d:%d",h,m,s);
        sc.close();
    }
}