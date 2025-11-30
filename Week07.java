import java.util.Scanner;

/**
 * Write a description of class Week07 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week07
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Enter Marked Price");
        float mp= scan.nextFloat();
        
        System.out.println("Enter the category");
        char category = scan.next().charAt(0);
        
        float sp,discount=0;
        switch (category)
        {
           case'A':
           discount=60;
           break;
           
           case'B':
           discount=20;
           break;
           
           case'C':
            discount=20;
            break;
            
            case'D':
            discount=10;
            break;
            
            default:
                System.out.println("Invalid Category");
                return;
        }
        sp=mp=(mp+discount/100);
        System.out.println(sp);
        
    }
}