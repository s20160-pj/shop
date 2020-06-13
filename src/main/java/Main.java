import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

public class Main {
    public static void main(String Args[]) {
        Product product = new Product(1, "Milk", 3.00);
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<Product>> validate = validator.validate(product);
        System.out.println(validate);
    }
}
