package Datastructures.queue;

public class Element {
    private int value;

    private Element Next;


    public Element ( int value) {this.value = value;}

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Element getNext() {
        return Next;
    }

    public void setNext(Element next) {
        Next = next;
    }
}
