import java.util.Scanner;

public class Grade
{
  public static void main ( String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    //variables
    int grade ;
    
    
    System.out.println("Welcome! To exit press -1 ");
    do
    {
     System.out.print("Enter the grade: ");
     grade = scan.nextInt();
     if ( grade <= 100 && grade >= 0 )
     {
       System.out.println("The letter conversion is: " + toLetter(grade));
     }
     else if ( grade != -1 )
     {
       System.out.println("Enter an valid grade!");
     }
    } while ( grade != -1 );
    System.out.print("Goodbye");
  }
  
  public static String toLetter(int x)
  {
    if ( x >= 85 )
    {
      return "A";
    }
    else if ( x >= 70 )
    {
      return "B";
    }
    else if ( x >= 50 )
    {
      return "C";
    }
    else 
    {
      return "D";
    }
  }
}
    
  