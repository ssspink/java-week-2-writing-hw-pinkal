import java.util.Scanner;

/**
 *
 *  Write a program to convert the upper case to lower case
 */
public class Programme_9_ConvertUpperToLowerCase
{
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println(" Enter the upper case string:  ");
        String uppercase =scanner.nextLine();
        Programme_9_ConvertUpperToLowerCase t =new Programme_9_ConvertUpperToLowerCase();
        t.convertUpperCaseToLowerCase(uppercase);
    }

    //conversion of uppercase to lower case method
    public void convertUpperCaseToLowerCase(String text)
    {
        System.out.println("The Lowercase value is ="  + text.toLowerCase());
    }

}
