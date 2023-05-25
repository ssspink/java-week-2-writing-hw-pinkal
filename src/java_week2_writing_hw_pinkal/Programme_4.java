package java_week2_writing_hw_pinkal;

/**Write a Java programme using the following steps.
 * Declare two instance and two static variables.
 *  Declare one instance method.
 *  Declare one static method.
 *  Call all four instance and static variables into both instance and static methods inside the print statement.
 *  Declare the Main method.
 *  Call both instance and static methods into the Main method and run the programme.
 *
 * */

public class Programme_4
{
    //declare two instance and two static variables
    String name ="Prime";
    String surname ="Testing";
    // static variables
    static boolean a =true;
    static boolean b= false;

    //declare one instance method
    // call all four instance and static variables into both instance and static methods inside the print statement
    public void instanceMethod()
    {
        System.out.println(name);
        System.out.println(surname);
        System.out.println(Programme_4.a);
        System.out.println(Programme_4.b);
    }
    //Declare one static method
    //call all four instance and static variables into both instance and static method inside the print statement
    public static void staticMethod()
    {
        Programme_4 programme_4 =new Programme_4();
        System.out.println(programme_4.name);
        System.out.println(programme_4.surname);
        System.out.println(a);
        System.out.println(b);

    }
    //Declare the main method
    //Call both instance and static methods into the Main method and run the programme.
    public static void main(String[] args) {
        Programme_4 programme_4 =new Programme_4();
        programme_4.instanceMethod();
        staticMethod();
    }
}
