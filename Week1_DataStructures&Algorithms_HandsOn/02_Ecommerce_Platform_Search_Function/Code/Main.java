public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Shoes", "Footwear"),
            new Product(2, "Laptop", "Electronics"),
            new Product(3, "Watch", "Accessories"),
            new Product(4, "Shirt", "Apparel"),
            new Product(5, "Mouse", "Electronics"),
            new Product(6, "Keyboard", "Electronics"),
            new Product(7, "Phone", "Electronics"),
            new Product(8, "Backpack", "Accessories"),
            new Product(9, "Hat", "Apparel"),
            new Product(10, "Charger", "Electronics")
        };

        Search s = new Search();
        int productId = 8;
        long start, end;

        System.out.println("Linear Search:");
        start = System.nanoTime();
        int linearIndex = s.linearSearch(products, productId);
        end = System.nanoTime();
        displayResult(products, linearIndex);
        System.out.println("Time Taken: " + (end - start) + " ns");


        System.out.println("Binary Search:");
        start = System.nanoTime();
        int binaryIndex = s.binarySearch(products, productId);
        end = System.nanoTime();
        displayResult(products, binaryIndex);
        System.out.println("Time Taken: " + (end - start) + " ns");
    }

    public static void displayResult(Product[] products, int index) {
        if (index != -1) {
            System.out.println(products[index]);
        } else {
            System.out.println("Product not found.");
        }
    }
}
