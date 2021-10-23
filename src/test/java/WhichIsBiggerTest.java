import org.junit.Assert;
import org.junit.Test;

public class WhichIsBiggerTest {
    @Test
    public void theBiggestOneTest(){
        int a = 3333;
        int b = 9999;
        int expResult = 9999;

        WhichIsBigger_6 theBiggestOne = new WhichIsBigger_6();
        int actRsult = theBiggestOne.theBiggestOne(a, b);

        Assert.assertEquals(expResult, actRsult);
    }
}
