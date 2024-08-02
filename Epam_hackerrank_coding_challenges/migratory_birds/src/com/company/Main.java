package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer> arr = new LinkedList<Integer>() ;
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(2);
        arr.add(2);

        System.out.println(migratoryBirds(arr));
    }
    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        TreeSet<Integer> a = new TreeSet<Integer>();

        for(int i=0;i<arr.size();i++){
            a.add(arr.get(i));
        }

        ArrayList<Integer> b = new ArrayList<>();
        int max = 0;
        Iterator aa = a.iterator();
        while(aa.hasNext()){
            int count =0;

            int szam = (int)aa.next();
            for(int j=0;j<arr.size();j++){
                if(arr.get(j)==szam){
                    count++;
                }
            }
            if(count>max){
                max=count;
            }
            b.add(count);
        }
        boolean megvan = false;
        int z=0;
        int ret = 0;
        Iterator bb = b.iterator();
        int counter = 0;
        int flag = 0;
        while(bb.hasNext()){
            int ezt =(int) bb.next();

            if(ezt==max){
                flag = counter;
                break;
            }
            counter++;
        }
        counter =0;
        aa = a.iterator();
        while(aa.hasNext()){
            int szam = (int)aa.next();

            if(counter==flag){
                ret = szam;
            }
            counter++;
        }
        return ret;
    }

}
