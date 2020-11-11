import org.junit.Test;

/**
 * @author xueneng on 2020/11/11.
 *         Description:
 */
public class ApiTest {
    @Test
    public void test_Builder(){
        System.out.println(Builder.levelOne(132.52D).getDetail());
        System.out.println(Builder.levelTwo(98.25D).getDetail());
        System.out.println(Builder.levelThree(85.43D).getDetail());

    }
}
