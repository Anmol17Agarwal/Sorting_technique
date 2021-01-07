package Heap_Sort;

public class Heap_sort {
    public void sort(int[] array,int size) {
        for (int j = (size / 2 - 1); j >= 0; j--) {
            heapify(array, size, j);
        }
        for (int unsorted_elements = size-1; unsorted_elements >= 0 ; unsorted_elements--) {
            swap(array,0,unsorted_elements);
            heapify(array,unsorted_elements,0);
        }
    }


    private void heapify(int[] array,int size,int pointer){
        int maximum = pointer;
        int leftChild = 2*pointer+1;
        int rightChild = 2*pointer+2;
        if(leftChild<size && array[leftChild]>array[maximum]){
            maximum=leftChild;
        }
        if (rightChild<size && array[rightChild]>array[maximum]){
            maximum = rightChild;
        }
        if(pointer!=maximum){
            swap(array,pointer,maximum);
            heapify(array,size,maximum);
        }
    }
    private void swap(int[] array,int a,int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
