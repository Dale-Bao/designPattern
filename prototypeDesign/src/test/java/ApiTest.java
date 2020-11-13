import org.junit.Test;

/**
 * @author xueneng on 2020/11/13.
 *         Description:
 */
public class ApiTest {
    @Test
    public void test_questionBank() throws CloneNotSupportedException {
        QuestionBankController questionBankController = new QuestionBankController();
        System.out.println(questionBankController.createPaper("xx","111"));
        System.out.println(questionBankController.createPaper("yy","222"));
        System.out.println(questionBankController.createPaper("zz","333"));
    }
}
