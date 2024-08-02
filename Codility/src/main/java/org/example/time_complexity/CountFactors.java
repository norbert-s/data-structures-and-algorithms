package org.example.time_complexity;

public class CountFactors {

    public static void main (String [] args){

        System.out.println(solution(100));

    }
    static public int solution(int N) {
        if(N==0) return 0;
        if(N==1) return 1;
        int counter = 0;
        for(int i=2;i<=(N/2);i++){
            if(N%i==0){
                counter++;
                System.out.println(i);
            }

        }
        return counter+2;
    }
}
