package pl.sda.algorytmy13.algorytmy;

import java.util.Iterator;
import java.util.ListIterator;

public class Bag<Item> implements Iterable<Item>{


    private Node first;  //pierwszy węzeł na liście
    private int N;


    private class Node
    {
        Item item;
        Node next;
    }

    public void Bag() {

    }

    public void add(Item item) {
        //to samo co w metodzie push klasy Stack
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }

    public boolean isEmpty() {
        return first==null; // lub N =0
    }

    public int size() {
        return N;
    }

    public Iterator<Item> iterator(){
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item>
    {
        private Node current = first;
        public boolean hasNext()
        {return current != null;}

        public void remove(){}

        public Item next()
        {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }


}
