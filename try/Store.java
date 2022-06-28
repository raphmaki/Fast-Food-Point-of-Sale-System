import java.util.Scanner;

/**
 * Abstract class Store - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Store
{
    String[] products;
    double[] prices;
    
    String[] oProducts = new String[500];
    double[] oPrices = new double[500];
    int[] oQuantity = new int[500];
    
    Scanner sc = new Scanner(System.in);
    Scanner scInt = new Scanner(System.in);
    Scanner scChar = new Scanner(System.in);
    
    // Contructor
    public Store() {
        
    }

    // Print and show each products
    abstract void showProd();
        
    // Get user's order
    abstract void getOrder();
    
    // Clear all orders
    abstract void clearOrder();
}
