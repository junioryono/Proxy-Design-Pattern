import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // Initialize list of items
        List<Product> items = new ArrayList<Product>();

        // Add products to list of items
        items.add(new Product("Hand Sanitizer", 20.5));
        items.add(new Product("Shampoo", 3));
        items.add(new Product("Soap", 5.63));
        items.add(new Product("GTA V", 69.99));
        items.add(new Product("Gift Card", 5));

        // Initialize SortingProxy object with SortingUtilityInterface type
        SortingUtilityInterface sortingProxy = new SortingProxy();

        // Sort using bubble sort
        System.out.println("\nBubble Sort:");
        sortingProxy.sort(items, 0);

        // Sort using quick sort
        System.out.println("\nQuick Sort:");
        sortingProxy.sort(items, 1);
    }
}
