package java_week2_writing_hw_pinkal;

import java.util.Scanner;

/** *Write a Java program to print the area and perimeter of a rectangle.
 *Test Data:
 *Width = 5.5 Height = 8.5
 *Expected Output:
 *Area is 5.6 * 8.5 = 47.60
 *Perimeter is 2 * (5.6 + 8.5) = 28.20
 *
 *
 */
public class Programme_14_AreaAndPerimeters
{
    public static void main(String[] args)
    {
            //scanner declaration for reading input from console
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the width of the rectangle:  ");
        int height =scanner.nextInt();
        System.out.println("Enter the height of the rectangle:  ");
        int width =scanner.nextInt();

    }
        public static void areaAndPerimeterOfRectangle(int height,int width){
            int perimeter =2 * (height +width);
            int area =(height  * width);
            System.out.println("The area of the rectangle is :" + area );
            System.out.println("The perimeter of the rectangle is:" + perimeter);
        }

}
