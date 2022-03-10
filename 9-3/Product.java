public class Product {
    public static void main(String[] atgs){
        int productID = 19845;
        String productName = "MensTrouser";
        char productType = 'A';
        short quantity = 148;
        double productPrice = 15_25_4.65;
        int barcodeNumber = 0b1101_0101_0001_1010;
        boolean availableStatus = true;

        System.out.println("\tProduct Details");
        System.out.println("----------------------------------------");
        System.out.println("Product Identification Code: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Category (A: Apprels G: Gadgeta): " + productType);
        System.out.println("product Quantity: " + quantity);
        System.out.println("product Price: $" + productPrice);
        System.out.println("product BarCode Number: " + barcodeNumber);
        System.out.println("Product Availability: " + availableStatus);

    }
}
