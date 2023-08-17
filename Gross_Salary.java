import java.util.Scanner;
public class gross{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int BS;
        double GS,DA,HRA;
        BS=sc.nextInt();
        if(BS<=10000)
        {
            DA=BS*0.8;
            HRA=BS*0.2;
        }
        else if(BS>=10000 && BS<=20000)
        {
            DA=0.9*BS;
            HRA=0.25*BS;
        }
        else
        {
            DA=BS*0.95;
            HRA=BS*0.3;
        }
        GS=BS+DA+HRA;
        System.out.printf("%.2f",GS);
    }
}