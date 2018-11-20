package com.company;

import java.util.Iterator;

public class ArrayList<T> implements ListADT<T> {
    protected final int DEFAULT_CAPACITY = 100;
    protected int rear;
    protected T[] list;
    private final int NOT_FOUND = -1;
    public ArrayList() {
        rear = 0;
        list = (T[]) (new Object[DEFAULT_CAPACITY]);
    }

    public ArrayList(int initialCapacity) {
        rear = 0;
        list = (T[]) (new Object[initialCapacity]);
    }

    @Override
    public T removeLast() {
        T result;

        if (isEmpty()) {
            System.out.println("vazio");
            return null;
        }
        rear--;
        result = list[rear];
        list[rear] = null;

        return result;
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) {
            System.out.println("vazio");
            return null;
        }

        T result = list[0];
        rear--;
        // shift the elements
        for (int scan = 0; scan < rear; scan++)
            list[scan] = list[scan + 1];


        list[rear] = null;

        return result;
    }

    @Override
    public T remove(T element) {
        T result;
        int index = find (element);

        if (index == NOT_FOUND){
            System.out.println("nao encontrado");
        }

        result = list[index];
        rear--;
        // shift the appropriate elements
        for (int scan=index; scan < rear; scan++)
            list[scan] = list[scan+1];


        list[rear] = null;

        return result;
    }
    private int find (T target)
    {
        int scan = 0, result = NOT_FOUND;
        boolean found = false;

        if (! isEmpty())
            while (! found && scan < rear)
                if (target.equals(list[scan]))
                    found = true;
                else
                    scan++;

        if (found)
            result = scan;

        return result;
    }

    @Override
    public T first() {
        if (isEmpty()){
            System.out.println("Vazia");
            return null;
        }

        return list[0];
    }

    @Override
    public T last() {
        if (isEmpty()){
            System.out.println("Vazia");
            return null;
        }
        return list[rear-1];
    }

    @Override
    public boolean contains(T target) {
        return (find(target) != NOT_FOUND);
    }

    @Override
    public boolean isEmpty() {
        return (rear == 0);
    }

    @Override
    public int size() {
        return rear;
    }

    @Override
    public Iterator<T> iterator() {
        //return new ArrayIterator<T> (list, rear);
        return null;
    }
}
