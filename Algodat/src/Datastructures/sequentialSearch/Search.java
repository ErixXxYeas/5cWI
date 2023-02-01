package Datastructures.sequentialSearch;

import Datastructures.HTLlinearSearch;

public class Search implements HTLlinearSearch {
    @Override
    public String search(int[] array, int b) {
        String x;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == b){
                int index = i+1;
                x = "Diese Variable ist in der Array an der stelle " + index +" vorhanden";
                return x;
            }
        }
        x = "diese Variable is NICHT in der Array";
        return x;



    }
}
