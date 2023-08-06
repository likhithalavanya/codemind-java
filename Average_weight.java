import java.util.Scanner;
public class ave{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x,w1,w2,w3;
        x=sc.nextInt();
        w1=sc.nextInt();
        w2=sc.nextInt();
        w3=3*x-w1-w2;
        System.out.printf("%d",w3);
        sc.close();
    }
}