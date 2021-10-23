import org.junit.Assert;
import org.junit.Test;

public class AscendingSequenceTest {
    AscendingSequence_2 ascSeqObj = new AscendingSequence_2();

    @Test
    public void AscendingSequenceTest1(){
        int a = 10, b = 25, n = 5;
        int[] expResult = {10, 15, 20, 25};

        int[] actResult = ascSeqObj.ascendingSequence(a, b, n);

        Assert.assertArrayEquals(expResult, actResult);
    }

    @Test
    public void AscendingSequenceTest2(){
        int a = 10, b = -25, n = -5;
        int[] expResult = {-1};

        int[] actResult = ascSeqObj.ascendingSequence(a, b, n);

        Assert.assertArrayEquals(expResult, actResult);
    }

    @Test
    public void AscendingSequenceTest3() {
        int a = 10, b = 10, n = 2;
        int[] expResult = {-1};

        int[] actResult = ascSeqObj.ascendingSequence(a, b, n);

        Assert.assertArrayEquals(expResult, actResult);

    }
}
