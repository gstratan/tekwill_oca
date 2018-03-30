package md.tekwill.oca.gstratan;

public class ShoppingCart {
    public static void main (String[] arg) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
        String message;
        message = custName + " vrea sa cumpere " +itemDesc;
        double  price = 100;
        double tax = 0.5;
        int quantity = 3;
        double total;
        total = price*quantity*tax;
        message = " Costul total este: " +total;
        System.out.println(message);
    }
}
