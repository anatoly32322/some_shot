package com.AuxiliaryCommands;

import com.LinkedList;

public class Add {
    private static LinkedList current;

    public Add(){
    }

    public static void add(LinkedList current, LinkedList val){
        if (current.hasNext()){
            add(current.getNext(), current);
        }
        current.setNext(val);
    }
}
