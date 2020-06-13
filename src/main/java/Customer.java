import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;
    private List<Product> purchasedItems = new ArrayList();

    public Customer(int id) {
        this.id = id;
    }

    public Customer() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getPurchasedItems() {
        return purchasedItems;
    }

    public void setPurchasedItems(List<Product> purchasedItems) {
        this.purchasedItems = purchasedItems;
    }
}
