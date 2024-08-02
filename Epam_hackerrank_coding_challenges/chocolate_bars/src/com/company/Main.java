package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static sun.plugin2.os.windows.OSVERSIONINFOA.size;

public class Main {

    public static void main(String[] args) {
	// write your code here

    }


    static int birthday(List<Integer> s, int d, int m) {

        int count=0;

        for(int i=0;i<=s.size()-1-m+1;i++){
            int sum =0;
            for(int j=0;j<m;j++){
                sum+=s.get(i+j);
            }
            if(sum==d){
                count++;
            }
        }
        return count;
    }
}
