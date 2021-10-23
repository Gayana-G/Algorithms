public class AscendingSequence_2 {

    public int[] ascendingSequence (int startNum, int endNum, int dif) {
        if (endNum <= startNum){
            int[] ascSequence = {-1};
            return ascSequence;
        } else {
            int[] ascSequence = new int[(endNum - startNum) / dif + 1];
            int j = 0;
            for (int i = startNum; i <= endNum; i += dif) {
                ascSequence[j] = i;
                j = j + 1;
            }
            return ascSequence;
        }
    }
}
