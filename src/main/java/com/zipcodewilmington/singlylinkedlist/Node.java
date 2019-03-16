package com.zipcodewilmington.singlylinkedlist;

public class Node <T> {

    public Node next;
    public T element;

    public Node(T element){
        this.element = element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node someNext) {
       if(next == null) {
           next = someNext;
       }else{
           next.setNext(someNext);
       }
        this.next = someNext;
    }

    public T getTheElement() {
        return element;
    }

    public void setTheElement(T element) {
        this.element = element;
    }
}
