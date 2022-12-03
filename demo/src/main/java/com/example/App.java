package com.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "\n\nHello World!" );
        Scanner reader = new Scanner(System.in);   
        System.out.println("Write something ");
        String n = reader.nextLine();
        System.out.print( "\n You typed this: " );
        System.out.println( n );
        reader.close();
       
    }
}
