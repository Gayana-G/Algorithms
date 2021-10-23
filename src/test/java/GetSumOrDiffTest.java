import org.junit.Assert;
import org.junit.Test;

public class GetSumOrDiffTest {

    @Test
    public void getResultTest1(){
        int n = 222;
        int expResult = 24753;

        GetSumOrDiff_4 getResultObj = new GetSumOrDiff_4();
        int actResult = getResultObj.getResult(n);

        Assert.assertEquals(expResult, actResult);
    }

    @Test
    public void getResultTest2(){
        int n = -10;
        int expResult = 56;

        GetSumOrDiff_4 getResult = new GetSumOrDiff_4();
        int actResult = getResult.getResult(n);

        Assert.assertNotEquals(expResult, actResult);
    }
}
