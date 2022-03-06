import java.util.List;

// Implement Sort interface
public class QuickSort implements Sort {

    public List<Product> sort(List<Product> items) {
        this.quickSort(items, 0, items.size() - 1);
        return items;
    }

    public void print(List<Product> items) {
        // Print each product
        items.forEach((product) -> {
            System.out.println("Name: " + product.getName() + ", ID: " + product.getId() + ", Price: " + product.getPrice());
        });
    }

    /*
     * Quick sort functionality
     */

    private void quickSort(List<Product> items, int low, int high) {
        if (low < high) {
            int pi = partition(items, low, high);
            quickSort(items, low, pi - 1);
            quickSort(items, pi + 1, high);
        }
    }

    private int partition(List<Product> items, int low, int high) {
        int pivot = items.get(high).getId();
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (items.get(j).getId() < pivot) {
                i++;
                swapValue(items, i, j);
            }
        }
        swapValue(items, i + 1, high);
        return (i + 1);
    }

    private void swapValue(List<Product> items, int one, int two) {
        Product tempValue = items.get(one);
        items.set(one, items.get(two));
        items.set(two, tempValue);
    }
}
