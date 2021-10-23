public class OddIndexes_3 {

    public int[] oddIndexes(int[] array){
        int countIndexes = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0){
                countIndexes++;
            }
        }
        int[] oddIndexes = new int[countIndexes];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0){
                oddIndexes[index] = array[i];
                index++;
            }
        }
        return oddIndexes;
    }
}
