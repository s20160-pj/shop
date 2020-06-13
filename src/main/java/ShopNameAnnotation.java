import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = Validation.class)
public @interface ShopNameAnnotation {
    public String shopNameAnnotation() default "Biedronka";
    String message() default "Nazwa sklepu nie może być krótsza niż 6 znaków, oraz nie może zawierać cyfr";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
