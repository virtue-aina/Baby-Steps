package Practice;

import java.util.Scanner;

public class LoanQualifier
{
    public static void main(String[] args)
    {
    /*
    Determine amount of Salary Earned by Employee
    Determine the years Worked
    Give loan if Employee has worked for both 12 years and earns more than #120, 000
     */
       //What we know
       int salaryRequired = 120000;
       int yearsWorked = 12;

       //What we don't know
        System.out.println(" How much do you earn? ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println ( "How many years have you worked? " );
        double years = scanner.nextDouble();
        scanner.close();
        //Output

        if (salary >= salaryRequired)
          {if
          (years>=yearsWorked) {System.out.println( "You get the loan!");
          }
          else
          {
              System.out.println( "You don't have the number of required years!");
          }
          }
        else
        {
            System.out.println("You don't earn upto #" + salaryRequired );
        }





    }
}
