
/**
 * Write a description of class Order here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Order extends Store
{
    // Variables
    String[] products = {"Banana Cake", "Banana Cupcake", "Blueberry Cake", "Blueberry Cupcake", "Brownies", "Cheese Cake", "Cheese Cupcake",
                         "Choco Mousse", "Cream Puff", "Dinner Rolls", "Egg Pie", "Ensaymada", "Lemon Bar", "Revel Bar", "Spanish Bread"};
    double[] prices = {699.99, 549.99, 749.99, 599.99, 250, 699.99, 499.99, 749.99, 250, 499.99, 699.99, 399.99, 250, 250, 499.99};
    
    String[] oProducts = new String[500];
    double[] oPrices = new double[500];
    int[] oQuantity = new int[500];
    
    int selectProduct;
    int selectQuantity;
    double tempTotalPrice;
    char orderAgain = 'y';
    
    // contructor
    public Order(){ 
        
    }
    
    // Print and show each product
    public void showProd() {
        System.out.println("---WELCOME TO GROUP NAPAY's PASTRY SHOP!----");
        System.out.println("Here's our menu");
        System.out.println("--------------------------------------------");
        for(int i = 0; i < products.length; i++){
            System.out.println((i+1) + ". " + products[i]);
        }      
    }
    
    // Get the order, store products, and compute
    public void getOrder() {
        int i = 0;
        while(orderAgain == 'y' || orderAgain == 'Y') {
            // get the user's order by the product's number shown
            try {
                System.out.println("--------------------------------------------");
                System.out.print("Product number: ");
                selectProduct = scInt.nextInt();
            } catch(Exception e) {
                System.out.println("[SYSTEM] Select existing product numbers only.");
                System.out.println("[SYSTEM] Something went wrong getting the user's order, please try again.");
            }
            
            try {
                // get the user's order quantity
                System.out.print("How many " + this.products[(selectProduct - 1)] + "? ");
                selectQuantity = scInt.nextInt();
            } catch(Exception e) {
                System.out.println("[SYSTEM] Something went wrong getting the user's order quantity, please try again.");
            }
            
            try {
                // store selected product and its quantity into ordered products
                this.oProducts[i] = this.products[(selectProduct - 1)];
                this.oQuantity[i] = selectQuantity;
                
                // compute the price of a single ordered product and store into an array
                this.oPrices[i] = (this.prices[selectProduct - 1] * this.oQuantity[i]);
                
                // calculate temporary total price
                for(double price : this.oPrices) {
                    tempTotalPrice += price;
                }
                
                // show price and temporary total price
                System.out.println("Price: " + this.oPrices[i]);
                System.out.printf("Total Price: %.2f \n", tempTotalPrice);
                
            } catch(Exception e) {
                System.out.println("[SYSTEM] Ordered items cannot be stored.");
                System.out.println("[SYSTEM] Something went wrong storing ordered products, quantities, and prices, please try again.");
            }
            
            // ask user if they want to order another product
            System.out.println("--------------------------------------------");
            System.out.print("Order again: Y/N ");
            orderAgain = scChar.next().charAt(0);
            
            if(orderAgain == 'n' || orderAgain == 'N') {
                // ask if the user wants to save the order 
                System.out.print("Save orders: Y/N ");
                char saveOrder = scChar.next().charAt(0);
                if(saveOrder == 'y' || saveOrder == 'Y') {
                    // terminate the situation but all info was saved
                    break;
                }
                else if(saveOrder == 'n' || saveOrder == 'N'){
                    // erasing all data inside elements of array
                    for(int j = 0; j < oProducts.length; j++){
                        oProducts[j] = null;
                        oQuantity[j] = 0;
                        oPrices[j] = 0;
                    }
                }
                else {
                    System.out.println("Invalid input, try again.");
                }
                break;
            }
            i++;
        }
    }
    
    // clear all orders
    public void clearOrder() {
        // erasing all data inside elements of array
        for(int j = 0; j < oProducts.length; j++){
            oProducts[j] = null;
            oQuantity[j] = 0;
            oPrices[j] = 0;
        }
    }
}
