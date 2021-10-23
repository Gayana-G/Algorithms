import org.junit.Assert;
import org.junit.Test;
import org.testng.annotations.AfterMethod;

public class CompareTwoIntTest {
    int expResult, actResult;
    CompareTwoInt_8 compareObj = new CompareTwoInt_8();

    @AfterMethod
    public void expActResult() {
        Assert.assertEquals(expResult, actResult);
    }

    @Test
    public void compareInts1() {
        expResult = 0;
        actResult = compareObj.compareNum(89, 89);
    }

    @Test
    public void compareInts2() {
        expResult = -1;
        actResult = compareObj.compareNum(-89, 89);
    }

    @Test
    public void compareInts3() {
        expResult = 1;
        actResult = compareObj.compareNum(89, -89);
    }
}
