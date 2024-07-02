import java.util.Scanner;

public class GradeSystem
{
    public static void main(String args[]){
        int avg;
        System.out.print("Welcome to grade calculator!!...\n    Enter your average out of 100: ");
        Scanner s=new Scanner(System.in);
        avg=s.nextInt();
        System.out.print("    ");
        if(avg>90)
            System.out.println("Your grade is A");
        else if (avg<90 && avg>80)
            System.out.println("Your grade is B");
        else if (avg<80 && avg>70)
            System.out.println("Your grade is C");
        else if (avg<70 && avg>60)
            System.out.println("Your grade is D");
        else if (avg<60 && avg>50)
            System.out.println("Your grade is E");
        else
            System.out.println("Your grade is F");
    }
}
