import java.util.Arrays;
import java.util.Comparator;

public class Search {

    public int linearSearch(Product[] products, int id) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductId() == id) {
                return i;
            }
        }
        return -1;
    }


    public int binarySearch(Product[] products, int id) {

        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int midId = products[mid].getProductId();

            if (midId == id) return mid;
            else if (midId < id) left = mid + 1;
            else right = mid - 1;
        }

        return -1;
    }
}
