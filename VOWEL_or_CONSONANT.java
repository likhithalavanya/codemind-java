import java.util.Scanner;
public class alpha{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char ch;
        ch=sc.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            System.out.printf("VOWEL");
        }
        else if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
        {
            System.out.printf("VOWEL");
        }
        else
        {
            System.out.printf("CONSONANT");
        }
    }
}