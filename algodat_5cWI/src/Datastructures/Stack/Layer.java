package Datastructures.Stack;


public class Layer {

    private int value;

    private Layer Last;

    public Layer (int value) { this.value = value;}
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Layer getLast(Layer top) {
        return Last;
    }

    public void setLast(Layer last) {
        Last = last;
    }
}
