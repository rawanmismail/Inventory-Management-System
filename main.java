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

        //Menu Options
        System.out.println("");
        System.out.println("========== MENU OPTIONS ==========");
        System.out.println("1. Add A Product");
        System.out.println("2. View All Products");
        System.out.println("3. Search A Product");
        System.out.println("4. Update Stock");
        System.out.println("5. Remove A Product");
        System.out.println("6. Low Stock Alert");
        System.out.println("7. Invetory Summary");
        System.out.println("8. Exit");
        System.out.println("===================================");
        System.out.println("");
        System.out.println("Enter your choice (1-8): ");


        scanner.close();
    }
}
