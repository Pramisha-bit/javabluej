import java.util.Scanner;

/**
 * Write a description of class week08 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week08
{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Enter GPA");
        float gpa= scan.nextFloat();
        
        System.out.println("Enter Attendance in % ");
        float attandance= scan.nextFloat();
        
        System.out.println("Enter Attitude score ");
        float attitude= scan.nextFloat();
        

        if(gpa>=3.2)
        {
            if (attandance>80)
            {
                if(attitude<5)
                {
                    System.out.println("Student is eligible for scholarship");
                    
                }
                else
                {
                    System.out.println("Student is not eligible for scholarship");
                }
            }
        }
    }
}   
    
