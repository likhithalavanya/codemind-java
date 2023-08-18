import java.util.Scanner;
public class exam{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int e,m,p,c,cs;
        e=sc.nextInt();
        m=sc.nextInt();
        p=sc.nextInt();
        c=sc.nextInt();
        cs=sc.nextInt();
        if(e>=34 && m>=34 && p>=34 && c>=34 && cs>=34)
        {
            System.out.printf("PASSED");
        }
        else
        {
            System.out.printf("FAILED");
        }
    }
}