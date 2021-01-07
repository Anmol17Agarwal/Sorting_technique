package Merge_Sort;

public class Merge_sort {


    public void sort(int[] array, int low, int high) {
        if (low<high) {
            int mid = (low + high) / 2;
            sort(array, low, mid);
            sort(array, mid+1, high);
            merge(array,low,mid,high);

        }
    }
    private void merge(int[] array,int low,int mid,int high){
        int i=low;
        int j=mid+1;
        int k=low;
        int[] newArray = new int[array.length];
        while(i<=mid && j<=high){
            if(array[i]<=array[j]){
                newArray[k]=array[i];
                i++;
            }
            else{
                newArray[k]=array[j];
                j++;
            }
            k++;
        }
        if(i>mid){
           for (; j <=high ; j++) {
                newArray[k]  = array[j];
                k++;
            }
        }
        else {
            for (; i <=mid; i++) {
                newArray[k]  = array[i];
                k++;
            }
        }
        for (int a = low; a <=high ; a++) {
            array[a] = newArray[a];
        }
    }


    }

