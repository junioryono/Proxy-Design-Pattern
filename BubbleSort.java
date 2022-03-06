import java.util.List;

// Implement Sort interface
public class BubbleSort implements Sort {

    public List<Product> sort(List<Product> items) {
        this.bubbleSort(items);
        return items;
    }

    public void print(List<Product> items) {
        // Print each product
        items.forEach((product) -> {
            System.out.println("ID: " + product.getId() + ", Name: " + product.getName() + ", Price: " + product.getPrice());
        });
    }

    /*
     * Bubble sort functionality
     */

    private void bubbleSort(List<Product> items) {
        for (int i = 0; i < items.size(); i++) {
            for (int k = 0; k < items.size() - 1 - i; k++) {
                if (items.get(k).getId() > items.get(k + 1).getId()) {
                    Product tempValue = items.get(k);
                    items.set(k, items.get(k + 1));
                    items.set(k + 1, tempValue);
                }
            }
        }
    }
}
