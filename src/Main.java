import Bubble_Sort.Bubble_Sort;
import Heap_Sort.Heap_sort;
import Insertion_Sort.Insertion_sort;
import Merge_Sort.Merge_sort;
import Quick_Sort.Quick_sort;
import Selection_Sort.Selection_sort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of element to be sorted");
        int size=scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] =(int)(Math.random()*100);
        }
        System.out.println("Array before Sorting");
        System.out.println(Arrays.toString(array));
        System.out.println("Press 1 for Bubble Sort");
        System.out.println("Press 2 for Selection Sort");
        System.out.println("Press 3 for Merge Sort");
        System.out.println("Press 4 for Quick Sort");
        System.out.println("Press 5 for Heap Sort");
        System.out.println("Press 5 for Insertion Sort");
        int opt = scanner.nextInt();


        switch (opt){
            case 1:
                System.out.println("Array after Bubble Sorting");

                Bubble_Sort bubble_sort =new Bubble_Sort();
                bubble_sort.sort(array);
                break;
            case 2:
                System.out.println("Array after Selection Sorting");

                Selection_sort selection_sort = new Selection_sort();
                selection_sort.sort(array);
                break;
            case 3:
                System.out.println("Array after Merge Sorting");
                Merge_sort merge_sort = new Merge_sort();
                merge_sort.sort(array,0,array.length-1);
                break;
            case 4:
                System.out.println("Array after Quick Sorting");
                Quick_sort quick_sort = new Quick_sort();
                quick_sort.sort(array,0,array.length-1);
                break;
            case 5:
                System.out.println("Array after Heap Sort");
                Heap_sort heap_sort = new Heap_sort();
                heap_sort.sort(array,array.length);
                break;
            case 6:
                System.out.println("Array after Insertion Sort");
                Insertion_sort insertion_sort = new Insertion_sort();
                insertion_sort.sort(array);

            default:
                break;
        }

        System.out.println(Arrays.toString(array));

    }
}
