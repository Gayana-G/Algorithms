public class GetSumOrDiff_4 {

    public int getResult(int a){
        int result = 0;
        if (a > 1) {
            for (int i = a; i >= 1; i--) {
                result += i;
            }
        } else if (a < 1) {
            for (int i = a; i <= 1 ; i++) {
                result -= i;
            }
        } else {
            result = 1;
        }
        return result;

    }
}
