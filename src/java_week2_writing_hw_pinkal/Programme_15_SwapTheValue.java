package java_week2_writing_hw_pinkal;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 */
public class Programme_15_SwapTheValue
{
    public static void main(String[] args)
    {
        //scanner declaration for reading input from console
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the first  variable value:  " );
        int first =scanner.nextInt();
        System.out.println("Enter the second variable value:   ");
        int second =scanner.nextInt();

    }
        //Swapping the value of variable
        public void swapTheValue(int a , int b)
    {
            int c;
        System.out.println("Before the swapping, The values of first variable is : " + a + " and second variable is : " + b);
        c=a;
        a=b;
        b=c;

        System.out.println("After the swapping, the value of the first variable is : " + a + " and second variable is : " +b);
    }



}
