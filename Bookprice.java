/* x      y       x*y     discount    selling price
   4     10       40       %10            30
   5     200      1000     %20            800
   7     1000     7000     %50            3500
   1     500      500      %0             500

   x- quantity of books
   y- price of books

*/
import java.util.Scanner;

public class Bookprice
{
    public static void main(String args[])
    {
        int x, y;
        double discount;
        System.out.print("Enter the value of x,y: ");
        Scanner s= new Scanner(System.in);
        x=s.nextInt();
        y=s.nextInt();
        if(x>=2 && x<=4)
            discount=(double)(x*y*10)/100;
        else if(x==5)
            discount=(double)(x*y*20)/100;
        else if(x>5)
            discount=(double)(x*y*50)/100;
        else
            discount=0;
        double sellingP= (double)x*y - discount;
        System.out.println("Selling price is ");
        System.out.println(String.format("%2f",sellingP));
    }
}
