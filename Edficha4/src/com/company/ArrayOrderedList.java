package com.company;

public class ArrayOrderedList<T> extends ArrayList<T> implements OrderedListADT<T> {

    public ArrayOrderedList(){
        super();
    }
    public ArrayOrderedList(int inicialCapacity){
        super(inicialCapacity);
    }
    @Override
    public void add(T element) {
        if(element instanceof Comparable){
            int i=0;
            while(i<rear){
                
            }
        }else{

        }
    }
}
