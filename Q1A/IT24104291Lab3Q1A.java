import java.until.Scanner;
public class II24104291Lab3Q1A{
public static void main (String[ ] args) { 
System.out.print( "Enter the price of 1kg of rice: " );
Scanner input = new Scanner (System.in); 
float price = input.nextFloat();

System.out.print( "Enter the number of kilograms you want to buy: ");
input = new Scanner(System.in);
float weight = input.nextlnt( );
System.out.println("The total amount is : " + price*weight);
      }
   }