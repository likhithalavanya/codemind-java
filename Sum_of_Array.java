import java.util.Scanner;
public class sum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //Array declaration
        int[] intArray=new int[n];
        for(int i=0; i<n; i++)
        {
            intArray[i]=sc.nextInt();
        }
        int sum=0;
        for(int eachElement: intArray)
        {
            sum+=eachElement;
        }
        System.out.println(sum);
    }
}