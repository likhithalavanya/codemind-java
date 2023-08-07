import java.util.Scanner;
public class tri{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int b,h,area;
        b=sc.nextInt();
        h=sc.nextInt();
        area=(b*h)/2;
        System.out.printf("%d",area);
    }
}