import java.util.*;

public class ProductCatalog {
    private final Map<Integer, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    public void removeProduct(int productId) {
        products.remove(productId);
    }

    public Product getProduct(int productId) {
        return products.get(productId);
    }

    public List<Product> listProducts() {
        return new ArrayList<>(products.values());
    }
}