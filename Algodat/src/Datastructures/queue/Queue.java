package Datastructures.queue;

import Datastructures.HTLQueue;

public class Queue implements HTLQueue {

private Element topElement;


    @Override
    public void enqueue(int value) {
        Element l = new Element(value);
        Element n = topElement;
        if ( topElement == null){
            topElement = l;
        }
        while (n.getNext()!=null){
            n = n.getNext();
        }
        n.setNext(l);
        }





    @Override
    public void dequeue() {
        topElement = topElement.getNext();
    }


}
