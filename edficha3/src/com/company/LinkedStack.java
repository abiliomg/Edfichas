package com.company;

public class LinkedStack<T> implements StackADT<T> {
    private Node<T> top;
    private int count = 0;

    @Override
    public void push(T element) {
        Node<T> temp = new Node<T>(element);
        temp.setNext(top);
        top=temp;
        count++;
    }

    @Override

    public T pop() {
        Node<T> aux=new Node<T>();
        aux=this.top;
        this.top=top.getNext();
        count--;
        return aux.getElem();
    }

    @Override
    public T peek() {
        return this.top.getElem();
    }

    @Override
    public boolean isEmpty() {
        return (count==0);
    }

    @Override
    public int size() {
        return count;
    }
    @Override
    public String toString(){
        String results ="";
        int i=0;
        Node<T> aux=new Node<T>();
        aux =this.top;
        while(aux!=null){
            results=results+aux.toString()+"\n";
            aux=aux.getNext();
        }
        return results;
    }
}
