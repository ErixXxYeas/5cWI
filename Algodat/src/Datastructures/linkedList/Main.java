package Datastructures.linkedList;

public class Main {
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.add(4);
        ll.add(5);
        ll.add(7);
        ll.add(9);
        System.out.println(ll.get(2));
        ll.remove(1);
        System.out.println(ll.get(2));
    }
}
