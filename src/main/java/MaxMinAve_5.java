public class MaxMinAve_5 {

    public int[] maxMinAve(int[] array){
        int max = array[0];
        int min = array[0];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
            sum += array[i];
        }
        int ave = sum / array.length;
        int[] maxMinAve = {max, min, ave};
        return maxMinAve;
    }
}
