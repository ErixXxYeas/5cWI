package Datastructures.binärSearch;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] arr = {1,6,7,3,4,9,3,0};

        SortSearch s = new SortSearch();

        System.out.println(Arrays.toString(s.sort(arr)));

    }
}
