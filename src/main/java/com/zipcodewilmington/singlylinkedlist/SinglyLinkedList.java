package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {
    private Node head;
    private Node n1;

    public SinglyLinkedList(T element) {
        head = new Node(element);
    }

    public SinglyLinkedList() {

    }
    //- add -- add an element to the list

    public void add(T element) {
        n1 = head;
        while (n1.getNext() != null) {
            n1 = n1.getNext();
        }
        n1.setNext(new Node(element));
    }


    //remove -- remove an element (specified by numeric index) from the list
    public void remove(Integer index) {
        // get previous node by setting a variable name prev
        //then -1 the "index" to get the node
        Node previousNode = getNode(index - 1);
//      then add index by one to set next to prev.
        previousNode.setNext(getNode(index + 1));
    }

    //contains -- returns true if the element is in the list, false otherwise
    public Boolean contains(T element) {

        n1 = head;
        while (n1.getNext().getTheElement() != element) {
            n1 = n1.getNext();
            if (n1.getNext() == (null)) {
                return false;
            }
        }
        return true;
    }

    //find -- returns the element's index if it is in the list, -1 otherwise
    public Integer find(T element) {

        n1 = head;
        // make a counter and set it to one
        Integer count = 1;
        // make a while loop
        while (n1.getNext().getTheElement() != element) {
            // im going to need to make a if statement
            if (n1.getNext() == null) {
                return -1;
            }
            n1 = n1.getNext();
            count++;
        }
        return count;
    }

    //size -- returns the current size of the list
    public Integer size() {
        n1 = head;
        if (n1 == null) {
            return 0;
        }
        // make a counter
        Integer count = 0;

        // so basically while the next "head" node is not equal to null
        while (n1 != null) {
            n1 = n1.getNext();
            count++;

        }
        count++;
        return count;
    }

    //get -- returns the element at the specified index
    public Node getNode(int index) {
        n1 = head;

        Integer count = 0;
        while (count != index) {
            n1 = n1.getNext();
            count++;
        }
        return n1;
    }

    public Object getTheElement(Integer index) {
        n1 = head;
        int count = 0;
        while (count != index) {
            n1 = n1.getNext();
            count++;
        }
        return n1.getTheElement();
    }

    //copy -- returns a new linked list containing the same values
    // (look up deep versus shallow copy)
    public SinglyLinkedList copy(SinglyLinkedList copyList) {
        SinglyLinkedList result = new SinglyLinkedList(this.getNode(0));
        for (int i = 1; i < this.size(); i++) {
          result.add(this.getNode(i).getTheElement());

        }
        return result;
    }
}
    //sort -- sorts the list using your algorithm of choice.
    // You must perform the sorting yourself (no fair using someone else's library)









// singley starts with a head,
//

//public Node getNode(int index)
//    count = 0;
//    forloop set i

/* public void remove (int index){
previous node(blue) = getnode (index -1)
node(blue).setnext = genode(index-1)
 */

/* public SingleyLinked copy(singleyLast){
new SingleyLinked list(element)
for(i =1, i <size , i++)
call the add method and get the orgianal node from the og singley list add(getnode.getelement)
return
*/
