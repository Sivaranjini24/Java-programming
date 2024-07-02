import java.util.Scanner;

public class leapyear {
    public static void main(String args[])
    {
        int year;
        System.out.print("Enter the year: ");
        Scanner s = new Scanner(System.in);
        year = s.nextInt();
        if(year%400 == 0 || (year%4 == 0 && year%100 != 0))
            System.out.println("Its a leap year!");
        else
            System.out.println("Its not a leap year!");
    }
}
