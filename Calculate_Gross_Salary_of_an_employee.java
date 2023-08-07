import java.util.Scanner;
public class grossSalary{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float b,hra,da,pf,gs;
        b=sc.nextFloat();
        hra=sc.nextFloat();
        da=sc.nextFloat();
        pf=b*12/100;
        gs=b+hra+da+pf;
        System.out.printf("%.2f
%.2f",pf,gs);
        sc.close();
    }
}