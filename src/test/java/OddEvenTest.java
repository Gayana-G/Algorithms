import org.junit.Assert;
import org.junit.Test;

public class OddEvenTest {

    @Test
    public void OddEvenTest1(){
        int num = 1;
        String expResult = "Odd";

        OddEven_1 oddEvenObject = new OddEven_1();
        String actResult = oddEvenObject.oddEvenUndefined(num);

        Assert.assertEquals(expResult, actResult);
    }

    @Test
    public void OddEvenTest2(){
        int num = -2;
        String expResult = "Even";

        OddEven_1 oddEvenObject = new OddEven_1();
        String actResult = oddEvenObject.oddEvenUndefined(num);

        Assert.assertEquals(expResult, actResult);
    }

    @Test
    public void OddEvenTest3(){
        int num = 2147483647 + 1;
        String expResult = "Undefined";

        OddEven_1 oddEvenObject = new OddEven_1();
        String actResult = oddEvenObject.oddEvenUndefined(num);

        Assert.assertEquals(expResult, actResult);
    }
}
