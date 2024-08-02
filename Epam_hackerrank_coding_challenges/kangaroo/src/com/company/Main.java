package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(bla(2,5,1000,1));
    }

    public static String bla(int x1,int x2,int v1,int v2){
        int pos1=x1;
        int pos2=x2;
        int i=0;
        boolean possible = false;
        int index = Math.abs((x1-x2)*(x1-x2));
        while(i!=65500000){
            pos1+=v1;
            pos2+=v2;
            if(pos1==pos2){
                possible=true;
            }
            i++;
        }
        if(possible){
            return "YES";
        }
        else{
            return "NO";
        }

    }
}
