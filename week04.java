import java.util.Scanner;

/**
 * Write a description of class week04 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week04{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Marked Price");
        float mp=scan.nextFloat();
        System.out.println("Enter category :(A/B/C/D)");
        char cat=scan.next().charAt(0);
        float sp,discount=0;
        if(cat=='A'){
            discount=60;
        }
        else if(cat=='B'){
            discount=40;
        }
        else if(cat=='C'){
            discount=20;
        }
        else if(cat=='D'){
            discount=10;
        }
        else{
            System.out.println("Invalid Category");
        }
        sp=mp-(mp+discount/100);
        System.out.println("Selling price is" +sp);
    }
}

