class Product {
    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    void display() {
        System.out.println(
            "Product ID: " + productId +
            ", Name: " + productName +
            ", Category: " + category
        );
    }
}

public class EcommerceSearch {

    // Linear Search using productId
    public static Product linearSearch(Product[] products, int searchId) {

        for (int i = 0; i < products.length; i++) {
            if (products[i].productId == searchId) {
                return products[i];
            }
        }

        return null;
    }

    // Binary Search using productId
    // Array must be sorted by productId
    public static Product binarySearch(Product[] products, int searchId) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (products[mid].productId == searchId) {
                return products[mid];
            } 
            else if (products[mid].productId < searchId) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        // Array for linear search
        Product[] products = {
            new Product(103, "Laptop", "Electronics"),
            new Product(101, "Shoes", "Fashion"),
            new Product(105, "Phone", "Electronics"),
            new Product(102, "Watch", "Accessories"),
            new Product(104, "Bag", "Fashion")
        };

        // Sorted array for binary search
        Product[] sortedProducts = {
            new Product(101, "Shoes", "Fashion"),
            new Product(102, "Watch", "Accessories"),
            new Product(103, "Laptop", "Electronics"),
            new Product(104, "Bag", "Fashion"),
            new Product(105, "Phone", "Electronics")
        };

        int searchId = 104;

        System.out.println("Linear Search Result:");
        Product result1 = linearSearch(products, searchId);

        if (result1 != null) {
            result1.display();
        } else {
            System.out.println("Product not found");
        }

        System.out.println("\nBinary Search Result:");
        Product result2 = binarySearch(sortedProducts, searchId);

        if (result2 != null) {
            result2.display();
        } else {
            System.out.println("Product not found");
        }
    }
}