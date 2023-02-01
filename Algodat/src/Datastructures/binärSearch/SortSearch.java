package Datastructures.binärSearch;

import Datastructures.HTLBinarySearch;

public class SortSearch implements HTLBinarySearch {

    @Override
    public int[] sort(int[] array) {

        boolean change = true;

        while (change){
            change = false;
        for (int i = 0; i < array.length -1 ; i++) {
            if (array[i+1] < array[i]){
                var x = array[i];
                array[i] = array[i+1];
                array[i+1] = x;
                change = true;
            }
        }
        }
    int[] sortedArr = array;
        return sortedArr;
    }

    @Override
    public String search(int[] array, int b) {



        return null;
    }
}
