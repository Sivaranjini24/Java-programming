//this program checks whether the user is eligible to vote or not by using if else statement

import java.util.Scanner;

public class canIVote
{
    public static void main(String args[])
    {
        int n;
        System.out.print("Welcome! enter your age: ");
        Scanner s= new Scanner(System.in);
        n = s.nextInt(); //System.out.println(n);
        if(n>=18)
            System.out.println("You're eligible to vote!");
        else
            System.out.println("You're not eligible to vote!");

    }
}
