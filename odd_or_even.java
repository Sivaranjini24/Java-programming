import java.util.Scanner;
//to find whether the number is odd or even
public class odd_or_even
{
    public static void main(String args[])
    {
        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        if(n%2==0)
            System.out.println(n+" is even");
        else
            System.out.println(n+" is odd");
    }
}
