import java.util.List;

// Implement sorting interface
public class SortingUtility implements SortingUtilityInterface {
    // Sort function takes in a list of items and the sorting approach
    // Returns the sorted list of items
    public List<Product> sort(List<Product> items, int sortingApproach) {
        if (sortingApproach == 0) {
            items = this.bubbleSort(items);
        } else if (sortingApproach == 1) {
            items = this.quickSort(items);
        }

        return items;
    }

    // Private method that calls BubbleSort().sort method
    private List<Product> bubbleSort(List<Product> items) {
        return new BubbleSort().sort(items);
    }

    // Private method that calls Quicksort().sort method
    private List<Product> quickSort(List<Product> items) {
        return new QuickSort().sort(items);
    }
}
