import java.util.ArrayList;
import java.util.List;

public class Shop {
    private int id;
    private String name;
    private List availableProducts = new ArrayList();
    private List soldProducts = new ArrayList();

    public Shop(int id, String name, List availableProducts, List soldProducts) {
        this.id = id;
        this.name = name;
        this.availableProducts = availableProducts;
        this.soldProducts = soldProducts;
    }

    public Shop() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getAvailableProducts() {
        return availableProducts;
    }

    public void setAvailableProducts(List availableProducts) {
        this.availableProducts = availableProducts;
    }

    public List getSoldProducts() {
        return soldProducts;
    }

    public void setSoldProducts(List soldProducts) {
        this.soldProducts = soldProducts;
    }
}
