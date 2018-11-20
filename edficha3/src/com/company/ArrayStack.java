package com.company;

import java.util.Arrays;

public class ArrayStack<T> implements StackADT<T> {
    private final int DEFAULT_CAPACITY = 100;
    private int top;
    private T[] stack;

    public ArrayStack() {
        top = 0;
        stack = (T[]) (new Object[DEFAULT_CAPACITY]);
    }

    public ArrayStack(int initialCapacity) {
        top = 0;
        stack = (T[]) (new Object[initialCapacity]);
    }

    @Override
    public void push(T element) {
        if (size() == stack.length)
            expandCapacity();
        stack[top] = element;
        top++;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("Empty");
            return null;

        }
        top--;
        T result = stack[top];
        stack[top] = null;
        return result;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            System.out.println("Empty");
            return null;
        }

        return stack[top - 1];
    }

    @Override
    public boolean isEmpty() {
        if (top == 0) return true;
        else return false;
    }

    @Override
    public int size() {
        return top;
    }
    public boolean expandCapacity(){
        stack= Arrays.copyOf(stack,(stack.length+1));
        return true;
    }
    @Override
    public String toString(){
        String results ="";
        int i=0;
        while(i<top){
            results=results+stack[i].toString();
            i++;
        }
        return results;
    }
}
