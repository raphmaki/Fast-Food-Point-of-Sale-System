import java.util.Scanner;

/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        Scanner scanInt = new Scanner(System.in);
        Scanner scanChar = new Scanner(System.in);
        
        // variables
        int action;
        char tryAgain = 'y';
        char again = 'y';
        
        // objects
        Order obj = new Order();
        Receipt rec = new Receipt();
        
        // Start of program
        while(again == 'y' || again == 'Y') {
            System.out.println("--------------------------------------------");
            System.out.println("----------GROUP NAPAY's Pastry Shop---------");
            System.out.println("--------------------------------------------");
            System.out.println("Select an action");
            System.out.println("1. New");
            System.out.println("2. Show Order");
            System.out.println("3. Show Receipt");
            System.out.print("Choose: ");
            action = scanInt.nextInt();
            if(action == 1) {
                // orderAgain variable set into y to reset, 
                obj.orderAgain = 'y';
                obj.clearOrder();
                obj.showProd();
                obj.getOrder();
            }
            else if(action == 2) {
                // show ordered items
                rec.showOrdered(obj.oProducts, obj.oPrices, obj.oQuantity);
            }
            else if(action == 3) {
                // show receipt
                rec.showReceipt(obj.oProducts, obj.oPrices, obj.oQuantity);
            }
            else {
                System.out.println("Invalid input, please try again.");
            }
            System.out.print("Continue operation? Y/N ");
            tryAgain = scanChar.next().charAt(0);
            if(tryAgain == 'n' || tryAgain == 'N') {
                break;
            }
        }
        System.out.println("Thank you for choosing us!");
    }
}