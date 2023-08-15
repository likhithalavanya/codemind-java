import java.util.Scanner;
public class weird{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        String ans="";
        if(n%2!=0)
        {
            ans="weird";
        }
        else if(n%2==0 && 6<=n && n<=20)
        {
            ans="weird";
        }
        else
        {
            ans="not weird";
        }
        System.out.printf(ans);
    }
}