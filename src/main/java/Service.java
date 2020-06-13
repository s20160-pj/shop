import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class Service {
    private Shop shop;

    public Service(Shop shop) {
        this.shop = shop;

    }
    private Optional<Product> findProductInShop(int productId) {
        Optional<Product> product = shop.getAvailableProducts().stream().filter(p -> p.getId() == productId).findFirst();
        return product;
    }

    private Optional<Product> findProductInCustomer(int productId, Customer customer) {
        Optional<Product> product = customer.getPurchasedItems().stream().filter(p -> p.getId() == productId).findFirst();
        return product;
    }

    public List<Product> sellProduct(int productId, Customer customer) {
        Optional<Product> product = findProductInShop(productId);
        if (product.isPresent()) {
            shop.getSoldProducts().add(product.get());
            shop.getAvailableProducts().remove(product.get());
            customer.getPurchasedItems().add(product.get());
        }
        return customer.getPurchasedItems();
    }

    public List<Product> returnProduct(int productId, Customer customer) {
        Product product = customer.getPurchasedItems().get(productId);
        shop.getAvailableProducts().add(product);
        return shop.getAvailableProducts();
    }

    public BigDecimal getSoldProductsReport() {
        BigDecimal sum = BigDecimal.valueOf(0);
        for (int i = 0; i < shop.getSoldProducts().size(); i++) {
            Product product = shop.getSoldProducts().get(i);
            sum = sum.add(BigDecimal.valueOf(product.getPrice()));
        }
        return sum;
    }
}
