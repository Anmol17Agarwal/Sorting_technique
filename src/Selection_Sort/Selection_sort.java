package Selection_Sort;

public class Selection_sort {
    public void sort(int[] array){
        for (int i = 0; i < array.length-1; i++)
        {
            int min_index = i;
            for (int j = i+1; j <array.length ; j++) {
                if (array[min_index] >= array[j]) {
                    min_index = j;
                }
            }
                swap(array,i,min_index);

        }
    }
    private void swap(int [] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
