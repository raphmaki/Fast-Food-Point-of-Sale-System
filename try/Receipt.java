/**
 * Write a description of class Receipt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Receipt extends Finance
{   
    // variables
    double totalPrice;
    double taxPrice;
    double taxPercent = 0.12;
    double tax;
    
    // show receipt
    public void showReceipt(String[] oProducts, double[] oPrices, int[] oQuantity) {
        for(int i = 0; i < oProducts.length; i++) {
            if(oProducts[i] == null) {
                break;
            }
            totalPrice += oPrices[i];
        }
        tax = totalPrice * taxPercent;
        System.out.println("--------------------------------------------");
        System.out.println("----------GROUP NAPAY's Pastry Shop---------");
        System.out.println("-------------------Receipt------------------");
        System.out.println("");
        System.out.println("Products --------- Quantity --------- Prices"); 
        for(int i = 0; i < oProducts.length; i++) {
            if(oProducts[i] != null) {
                System.out.println(oProducts[i] + " --------- " + oQuantity[i] + " --------- " + oPrices[i]);
            }
        }
        System.out.println("");
        System.out.printf("Price: " + " ------------------------ %.2f \n", totalPrice);
        System.out.printf("Tax: " + " ------------------------ %.2f \n", tax);
        System.out.printf("Total Price: " + " ------------------- %.2f \n", (totalPrice + tax));
        System.out.println("--------------------------------------------");
        System.out.println("Thankyou for choosing GROUP NAPAY's PASTRY SHOP!");
        System.out.println("--------------------------------------------");
    }
    
    // show orders
    public void showOrdered(String[] oProducts, double[] oPrices, int[] oQuantity) {
        System.out.println("--------------------------------------------");
        System.out.println("----------GROUP NAPAY's Pastry Shop---------");
        System.out.println("-------------------Orders-------------------");
        System.out.println(""); 
        System.out.println("Products --------- Quantity --------- Prices");
        for(int i = 0; i < oProducts.length; i++) {
            if(oProducts[i] != null) {
                System.out.println(oProducts[i] + " --------- " + oQuantity[i] + " --------- " + oPrices[i]);
            }
        }
        System.out.println("---------------------------------");
    }
}
