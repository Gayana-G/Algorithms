import org.junit.Test;

public class IntM_9Test {

    @Test
    public void intM1() {
        String expResult = "Good Number";

        IntM_9 tesObject = new IntM_9();
        String actResult = tesObject.answer(15);
    }

    @Test
    public void IntM2() {
        String expResult = "Bad Number";

        IntM_9 testObject = new IntM_9();
        String actResult = testObject.answer(12);
    }

    @Test
    public void IntM3(){
        String expResult = "Poor Number";

        IntM_9 testObject = new IntM_9();
        String actResult = testObject.answer(20);
    }

    @Test
    public void IntM4(){
        String expResult = "-1";

        IntM_9 testObject = new IntM_9();
        String ActResult = testObject.answer(17);
    }

}
