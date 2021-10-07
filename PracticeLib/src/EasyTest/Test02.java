package EasyTest;

public class Test02 {
    int[] array;

    public void setArray(int[] array) {
        this.array = array;
    }

    public int[] BubbleSort(){
        int temp = 0;//
        int sortLength = array.length;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < sortLength-1; j++) {
                if (array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            sortLength--;
        }

        return array;
    }
}
