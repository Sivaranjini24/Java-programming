import java.util.*;
public class multiplication
{
    public static void main(String args[])
    {
        int a, b, c;
        Scanner s= new Scanner(System.in);
        System.out.println("enter a, b");
        a= s.nextInt();
        b= s.nextInt();
        c= a*b;
        System.out.println("Multiplication value is "+c);
    }
}
