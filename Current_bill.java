import java.util.Scanner;
public class current{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int units,uc=0;
        double bill,sc,tc;
        units=s.nextInt();
        if(units<200)
        {
            bill=units*1.20;
        }
        else if(units>=200 && units<400)
        {
            bill=units*1.50;
        }
        else if(units>=400 && units<600)
        {
            bill=units*1.80;
        }
        else
        {
            bill=units*2.00;
        }
        if(bill>400)
        {
            sc=bill*0.15;
            tc=bill+sc;
            System.out.printf("%.2f",tc);
        }
        else
        {
            tc=bill+100;
            System.out.printf("%.2f",tc);
        }
    }
}