package Datastructures.Stack;

import Datastructures.HTLStack;

public class Stack implements HTLStack {

    private Layer Top;
    @Override
    public void push(int value) {
        Layer la = new Layer(value);
        if (Top == null){
            Top = la;
        } else {
            la.setLast(Top);
            Top = la;
        }
    }

    @Override
    public void pop() {
        if ( Top == null){
            return;
        } else {
            peek();
           Top = Top.getLast(Top);
        }
    }

    @Override
    public int peek() {
        return Top.getValue();
    }
}
