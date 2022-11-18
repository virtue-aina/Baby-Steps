import java.util.Scanner;
public class Seasons
{
    public static void main (String[] args)
    {
    //1.Season of the year.
        System.out.println("Enter Season of the Year");
         Scanner scanner = new Scanner(System.in);
         String season = scanner.nextLine();
    //2.whole number.
        System.out.println("Enter Whole Number");
        int number = scanner.nextInt();
    //3.adjective.
        System.out.println("Enter Adjective");
        String adjective = scanner.next();


    //4.Display result.
        System.out.println("On a " + adjective + season + " day, I drank a minimum of " + number + " cups of coffee" );
        scanner.close();
    }
}
