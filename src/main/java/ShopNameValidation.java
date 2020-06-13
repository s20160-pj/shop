import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ShopNameValidation implements ConstraintValidator<ShopNameAnnotation, String> {
    @Override
    public void initialize(ShopNameAnnotation constraintAnnotation) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return !s.matches("[0-9]+") && s.length() >= 6;
    }
}
