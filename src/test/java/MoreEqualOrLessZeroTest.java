import org.testng.annotations.Test;

public class MoreEqualOrLessZeroTest {

    @Test
    public void getBoolean1(){
        int a = 555;
        boolean expResult = true;

        MoreEqualOrLessZero_7 moreOrLessObj = new MoreEqualOrLessZero_7();
        boolean actResult = moreOrLessObj.isMoreEqualOrLessZero(a);
    }

    @Test
    public void getBoolean2(){
        int a = 0;
        boolean expResult = true;

        MoreEqualOrLessZero_7 moreOrLessObj = new MoreEqualOrLessZero_7();
        boolean actResult = moreOrLessObj.isMoreEqualOrLessZero(a);
    }

    @Test
    public void getBoolean3(){
        int a = -555;
        boolean expResult = true;

        MoreEqualOrLessZero_7 moreOrLessObj = new MoreEqualOrLessZero_7();
        boolean actResult = moreOrLessObj.isMoreEqualOrLessZero(a);
    }
}
