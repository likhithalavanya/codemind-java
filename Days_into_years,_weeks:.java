import java.util.Scanner;
public class ave{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int d,y,w;
        d=sc.nextInt();
        y=d/365;
        w=(d-(y*365))/7;
        System.out.printf("%d
%d",y,w);
        sc.close();
    }
}