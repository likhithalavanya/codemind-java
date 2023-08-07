import java.util.Scanner;
public class year{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int y,n;
        n=sc.nextInt();
        y=n%100;
        System.out.printf("%02d",y);
    }
}