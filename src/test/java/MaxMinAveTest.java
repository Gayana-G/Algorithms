import org.junit.Assert;
import org.junit.Test;

public class MaxMinAveTest {

    @Test
    public void resultArray1(){
        int[] data = {1, 2, 3, 4, 5};
        int[] expResult = {5, 1, 3};

        MaxMinAve_5 maxMinAveObj = new MaxMinAve_5();
        int[] actResult = maxMinAveObj.maxMinAve(data);

        Assert.assertArrayEquals(expResult, actResult);
    }

    @Test
    public void resultArray2(){
        int[] data = {-3, 0, 155, -39, 1003};
        int[] expResult = {1003, -39, 223};

        MaxMinAve_5 maxMinAveObj = new MaxMinAve_5();
        int[] actResult = maxMinAveObj.maxMinAve(data);

        Assert.assertArrayEquals(expResult, actResult);
    }
}
