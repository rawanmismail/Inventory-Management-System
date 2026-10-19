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

        //Greeting 
        System.out.println("================================");
        System.out.println("   INVETORY MANAGEMENT SYSTEM   ");
        System.out.println("================================");
        System.out.println("Welcome! Manage your invetory here.");

        

        scanner.close();
    }
}
