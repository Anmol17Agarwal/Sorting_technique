package Bubble_Sort;

public class Bubble_Sort {
        public void sort(int[] sort){
            for (int i = 0; i < sort.length ; i++) {
                for (int j = 0; j < sort.length-1 ; j++) {
                       if(sort[j]>sort[j+1]){
                           swaping(j,sort);
                       }
                }
            }
        }
        private void swaping(int j,int [] array){
            int temp=array[j];
            array[j]=array[j+1];
            array[j+1]=temp;
        }

}
