package matter;
import java.math.BigDecimal;

/**
 * @author xueneng on 2020/11/11.
 *         Description:
 */
public interface Matter {
    String scene();
    String brand();
    String model();
    BigDecimal price();
    String desc();
}
