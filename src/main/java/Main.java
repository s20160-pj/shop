import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

public class Main {
    public static void main(String Args[]) {
        Shop shop = new Shop(1, "Biedronka");
        Service service = new Service(shop);
        Customer customer = new Customer(1);
        Product product = new Product(1, "Milk", 3.00);
        Product product1 = new Product(2, "Bread", 2.50);
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<Product>> validate = validator.validate(product);
        System.out.println(validate);
        shop.getSoldProducts().add(product);
        shop.getSoldProducts().add(product1);
        System.out.println(service.getSoldProductsReport());
        shop.getAvailableProducts().add(product);
        service.sellProduct(1, customer);
    }
}
