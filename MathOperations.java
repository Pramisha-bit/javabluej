import java.util.Scanner;

/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations{
public static void main (String[] args){
    int a=15;
    int b=3;
    int c=a+b;
    int d=a-b;
    int e=a*b;
    int f=a%b;
    
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);
    
    System.out.println(a++);
    System.out.println(++a);
    
    System.out.println(a>b);
    System.out.println(a!=b);
    System.out.println(a==b);
    System.out.println(a<b);
    
    
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter grade");
    int grade=scan.nextInt();
    
    String A = (grade>=40)? "Pass" :"Fail";
    System.out.println(A);
    
    
    
}
}




