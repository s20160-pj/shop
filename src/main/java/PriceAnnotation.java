import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = Validation.class)
public @interface PriceAnnotation {
    public double priceAnnotation() default 0.00;
    String message() default "Cena produktu nie może być nullem";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
