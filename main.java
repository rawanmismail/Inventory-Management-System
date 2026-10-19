import java.util.Scanner;
public class InvetoryManager {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        //Final Constant 
        final int MAX_PRODUCTS = 100; //Maximum 100 products 

        //Parallell Arrays 
        String[] productID = new String[MAX_PRODUCTS];
        String[] productName = new String[MAX_PRODUCTS];
        String[] productCategory = new String[MAX_PRODUCTS];
        double productPrice = new double[MAX_PRODUCTS];
        int[] productQuantity = new int[MAX_PRODUCTS];
        int[] minStockLevel = new int[MAX_PRODUCTS];
        


        scanner.close();
    }
}
