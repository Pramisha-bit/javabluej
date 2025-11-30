import java.util.Scanner;

/**
 * Write a description of class week9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week9
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Enter GPA range:0.0 to 4.0");
        float gpa= scan.nextFloat();
        char grade;
        
        if(gpa >=3.6 && gpa==4)
        {
            grade='A';
        }
        else if(gpa==3)
        {
            grade='B';
        }
        else if(gpa==2)
        {
            grade='C';
            
        }
        else if(gpa==2)
        {
            grade='D';
            
        }
        else
        {
            grade='E';
        }
        System.out.println("GPA:"+gpa);
        System.out.println("Grade:"+grade);
    }
}   
       
        
        
        
    
