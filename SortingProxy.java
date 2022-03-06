import java.util.List;

// Implement sorting interface
public class SortingProxy implements SortingUtilityInterface {
    // Sort function takes in a list of items and the sorting approach
    // The list of items get sorted by the SortingUtility class
    // Prints the list of items according to their sorting approach
    // Returns the sorted list of items
    public List<Product> sort(List<Product> items, int sortingApproach) {
        items = new SortingUtility().sort(items, sortingApproach);
        if (sortingApproach == 0) {
            new BubbleSort().print(items);
        } else if (sortingApproach == 1) {
            new QuickSort().print(items);
        }

        return items;
    }

}
