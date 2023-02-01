package Datastructures.sequentialSearch;

public class main {
    public static void main(String[] args) {
        int array[] = {0,1,2,3,4,5,6,7,8,9};
        int searched = 2;

        Search s = new Search();

        System.out.println(s.search(array,searched));

    }
}
