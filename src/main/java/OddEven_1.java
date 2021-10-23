import com.sun.source.doctree.IndexTree;

public class OddEven_1 {

    public String oddEvenUndefined(int num){

        if (num == Integer.MIN_VALUE - 1 || Integer.MAX_VALUE + 1 == num){
            return "Undefined";
        }else if (num % 2 == 0){
            return "Even";
        } else
            return "Odd";
    }
}
