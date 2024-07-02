import java.util.Scanner;

public class findingnoOfDigits
{
    public static void main(String args[])
    {
        int n, temp, count=0;
        System.out.print("Enter any number: ");
        Scanner s= new Scanner(System.in);
        n=s.nextInt();
        for(temp=n;temp>0;temp=temp/10)
        {
            count++;
        }
        System.out.println("Number of digits in n: "+ count);
    }
}
