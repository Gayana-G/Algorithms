import org.junit.Assert;
import org.junit.Test;

public class OddIndexesTest {

    @Test
    public void oddIndexArray1(){
        int[] input = {-45, 590, 234, 985, 12, 68};
        int[] expResult = {590, 985, 68};

        OddIndexes_3 oddIndObj = new OddIndexes_3();
        int[] actResult = oddIndObj.oddIndexes(input);

        Assert.assertArrayEquals(expResult, actResult);
    }


    @Test
    public void oddIndexArray2(){
        int[] input = {-45, -476, 0, 35, 129, 21, -436, 387};
        int[] expResult = {-476, 35, 21,  387};

        OddIndexes_3 oddIndObj = new OddIndexes_3();
        int[] actResult = oddIndObj.oddIndexes(input);

        Assert.assertArrayEquals(expResult, actResult);
    }
}
