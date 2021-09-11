/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 Mateo Gamero
 */
import java.util.Scanner;
public class App
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                Press C to convert from Fahrenheit to Celsius.
                Press F to convert from Celsius to Fahrenheit.\s
                Your choice:\s""");
        String temp = sc.nextLine();
        if(temp.equals("C") || temp.equals(("c")))
        {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            int faren = sc.nextInt();
            int cel = (faren - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is " + cel);
        }
        if(temp.equals("T") || temp.equals(("t")))
        {
            System.out.print("Please enter the temperature in Celsius: ");
            int C = sc.nextInt();
            int F = (C * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is " + F);
        }
    }
}
