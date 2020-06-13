import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class Validation implements ConstraintValidator<PriceAnnotation, Double > {
    @Override
    public void initialize(PriceAnnotation constraintAnnotation) {

    }

    @Override
    public boolean isValid(Double aDouble, ConstraintValidatorContext constraintValidatorContext) {
        return aDouble != null;
    }
}
