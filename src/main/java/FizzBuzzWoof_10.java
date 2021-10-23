import java.util.Arrays;

public class FizzBuzzWoof_10 {
    //public String[] fizzBuzzWoof(int startNum, int endNum) {
    public static void main(String[] args) {
        int startNum = 1, endNum = 38;
        String[] resultArray = new String[endNum];

        int newNum = startNum;
        for (int i = 0; i < endNum; i++) {
            String strInt = String.valueOf(newNum);
            if (newNum % 3 == 0 || strInt.contains("3")) {
                resultArray[i] = "Fizz";
            } else if (newNum % 5 == 0 || strInt.contains("5")) {
                resultArray[i] = "Buzz";
            } else if (newNum % 7 == 0 || strInt.contains("7")) {
                resultArray[i] = "Woof";
            }
            if (newNum % 3 == 0 && i % 5 == 0) {
                resultArray[i] = "FizzBuzz";
            } else if (newNum % 3 == 0 && newNum % 7 == 0) {
                resultArray[i] = "FizzWoof";
            } else if (newNum % 5 == 0 && newNum % 7 == 0) {
                resultArray[i] = "BuzzWoof";
            }
            if (newNum == 33) {
                resultArray[i] = "FizzFizzFizz";
            } else if (newNum == 55) {
                resultArray[i] = "BuzzBuzzBuzz";
            } else if (newNum == 77) {
                resultArray[i] = "WoofWoofWoof";
            }
            resultArray[i] = String.valueOf(newNum);

            newNum++;
        }
        System.out.println(Arrays.toString(resultArray));

        //return resultArray;
    }
}

