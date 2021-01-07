package Quick_Sort;

public class Quick_sort {
    public void sort(int[] array,int low,int high){
        if(low<high){
            int pivotIndex = partition(array,low,high);
            sort(array,low,pivotIndex-1);
            sort(array,pivotIndex+1,high);
        }
    }
    private int partition(int[] array,int low,int high){
        int pivot = array[low];
        int start=low;
        int end=high;

        while(start<end)
        {
            while (array[start] <= pivot){
                start++;
            }

            while (array[end] > pivot){
                end--;
            }

            if (start < end) {
                swap(array, start, end);
            }
        }
        swap(array,low,end);
        return end;


    }
    private void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j]=temp;
    }
}

