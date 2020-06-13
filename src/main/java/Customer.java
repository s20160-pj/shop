import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;
    private List purchasedItems = new ArrayList();

    public Customer(int id, List purchasedItems) {
        this.id = id;
        this.purchasedItems = purchasedItems;
    }

    public Customer() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List getPurchasedItems() {
        return purchasedItems;
    }

    public void setPurchasedItems(List purchasedItems) {
        this.purchasedItems = purchasedItems;
    }
}
