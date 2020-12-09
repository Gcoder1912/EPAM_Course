package EPAM.Dmitriy;

import java.util.Scanner; //Import Scanner for I/O task

public class Input_Username
{
    public static void main( String[] args )
    {
        Scanner name = new Scanner(System.in); //Scanner declaration
        System.out.println("Please, enter your name: ");

        String username = name.nextLine(); //Input username
        System.out.println( "Hello " + username ); //Result output
    }
}
