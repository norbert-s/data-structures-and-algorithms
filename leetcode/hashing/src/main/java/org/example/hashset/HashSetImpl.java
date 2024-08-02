package org.example.hashset;

import java.util.ArrayList;
import java.util.List;

public class HashSetImpl {
    List<List<Integer>> nums;

    int CAPACITY = 1000001;
    public HashSetImpl() {
        nums=new ArrayList<>(CAPACITY);
        for(int i=0;i<CAPACITY;i++){
            nums.add(new ArrayList<>(null));
        }
    }

    public void add(int key) {
        int i=0;
        int hashKey = hashFunc(key);

        //size needs to be checked
        if(nums.get(hashKey).size()==0){
            nums.set(hashKey,new ArrayList<>(List.of(key)));


        }else{
            while(nums.get(hashKey).get(i)!=null){
                i++;
            }
            List<Integer> subList = nums.get(hashKey);
            subList.add(key);
            nums.set(hashKey,subList);
        }
    }

    public void remove(int key) {
        if(!contains(key))return;
        int hashKey= hashFunc(key);
        int i=0;
        int size=nums.get(hashKey).size();
        while(i<size){
            if(nums.get(hashKey).get(i)==key){
                System.out.println(nums.get(hashKey).get(i));
                List <Integer> subList = nums.get(hashKey);
                System.out.println(subList);
                subList.remove(Integer.valueOf(key));
                nums.get(hashKey).addAll(subList);
                break;
            }
        }
    }

    public boolean contains(int key) {
        int hashKey = hashFunc(key);
        if(nums==null || nums.get(hashKey).size()==0) return false;
        else{
            int i=0;
            int size = nums.get(hashKey).size();
            while(i<size){
                if(nums.get(hashKey).get(i)==key)return true;
                i++;
            }
            System.out.println("hi");
        }
        return false;
    }

    int hashFunc(int key){
        return key%CAPACITY;
    }

}
