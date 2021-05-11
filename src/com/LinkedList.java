package com;


import com.AuxiliaryCommands.Add;
import com.AuxiliaryCommands.Show;

public class LinkedList {
    private LinkedList next;
    private String value = "";


    public LinkedList(){}

    public LinkedList(String value){
        this.value = value;
    }

    public Boolean hasNext(){
        return next != null;
    }

    public LinkedList getNext() {
        return next;
    }

    public void setNext(LinkedList next) {
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public static void add(LinkedList current, LinkedList val){
        Add.add(current, val);
    }

    public static String show(LinkedList current){
        return Show.show(current, "");
    }

    @Override

    public String toString(){
        return value;
    }
}
