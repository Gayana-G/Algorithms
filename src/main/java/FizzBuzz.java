import java.util.Arrays;

public class FizzBuzz {

    public String[] fizzBuzz (int startNum, int endNum){
        String[] numbers = new String[endNum - startNum + 1];
        int newNum = startNum;
        for (int i = startNum; i < endNum - startNum + 1; i++) {
            if (newNum % 15 == 0){
                numbers[i] = "FizzBuzz";
            }else if (newNum % 3 == 0) {
                numbers[i] = "Fizz";
            } else if (newNum % 5 == 0) {
                numbers[i] = "Buzz";
            } else {
                numbers[i] = String.valueOf(newNum);

            }
            newNum += 1;
        }
        System.out.println(Arrays.toString(numbers));
        
        return numbers;
    }
}
