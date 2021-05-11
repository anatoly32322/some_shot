package com.AuxiliaryCommands;

import com.LinkedList;

public class Show {
    public Show(){}

    public static String show(LinkedList current, String result){
        if (current.hasNext()){
            return show(current.getNext(), result + " " + current.toString());
        }
        return result + " " + current.toString();
    }
}
