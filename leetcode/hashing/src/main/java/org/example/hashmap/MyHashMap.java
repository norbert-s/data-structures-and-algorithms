package org.example.hashmap;

import java.util.ArrayList;
import java.util.List;

public class MyHashMap {
    int ARRAY_SIZE=100;
    public ArrayList<ArrayList<Node>> list;


    public MyHashMap() {
        list= new ArrayList<>(ARRAY_SIZE);
        for(int i=0;i<ARRAY_SIZE;i++){
            list.add(new ArrayList<>());
        }
    }

    public void put(int key, int value) {
        int hashKey= hashingFunc(key);
        System.out.println("hash key "+hashKey+"and key "+key+" and value "+value);
        Node node = new Node(key,value);

        List<Node> child = list.get(hashKey);

        if(child.size()==0){
            child.add(node);
            System.out.println("adding"+value);
        }else{
            boolean found = false;
            for(int i=0;i<child.size();i++){
                if(child.get(i).getKey()==key){
                    child.set(i,node);
                    found = true;
                    break;
                }
            }
            if(found==false){
                child.add(node);
            }
        }

    }

    public int get(int key) {
        int hashKey = hashingFunc(key);
        List<Node> child = list.get(hashKey);
        if(child==null) return -1;
        else{
            for(Node i:child){
                if(i.getKey()==key){
                    return i.getValue();
                }
            }
        }
        return -1;
    }

    public void remove(int key) {
        int hashKey= hashingFunc(key);
        List<Node> child = list.get(hashKey);
        if(child!=null){
            for(int i=0;i<child.size();i++){
                if(child.get(i).getKey()==key){
                    child.remove(i);
                    break;
                }
            }
        }
    }

    private int hashingFunc(int key){
        return key%ARRAY_SIZE;
    }
}

class Node{
    int key;
    int value;
    Node(int key,int value){
        this.key=key;
        this.value=value;
    }

    Node(){}

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}