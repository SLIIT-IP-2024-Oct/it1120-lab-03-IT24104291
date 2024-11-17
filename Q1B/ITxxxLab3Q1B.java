
import java. util. Scanner; 
public class ITxxxLab3Q1B{

public static void main (String[ ] args) { 
System. out . print( "Enter the price of Ikg of rice: ") ;
Scanner input = new Scanner (System.in) ;
float price = input.nextFloat();

System. out . print( "Enter the number of kilograms you want to buy: “ ) ;
 input = new Scanner (System. in) ; 
float weight = input.nextlnt( ) ;
 
double finalPrice = price*weight*0.9;
System. out. Println("The total amount after
10% discount is: " + finalPrice);
    }
   } 
