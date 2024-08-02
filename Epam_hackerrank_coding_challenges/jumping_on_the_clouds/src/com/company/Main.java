package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

    }
    // Complete the jumpingOnClouds function below.
    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {



        int i=0;
        int count =0;
        int length = c.length-1;
        while(i<=length){
            if(i+2==length){
                if((c[i+1]==0 && c[i+2]==0)||(c[i+1]==1 && c[i+2] ==0)){
                    i+=2;
                    count++;
                }
                else if (c[i+1]==0 && c[i+2]==1 ) {
                    i = i + 1;
                    count++;
                }
                else{
                    i++;
                    count++;
                }
            }
            else if(i+2<length){
                if((c[i+1]==0 && c[i+2]==0)||(c[i+1]==1 && c[i+2] ==0)){

                    count++;
                    i=i+2;
                }
                else if (c[i+1]==0 && c[i+2]==1 ) {
                    i = i + 1;
                    count++;
                }
                else{
                    i++;
                    count++;
                }
            }
            else if(i+1==length ){
                i=i+1;
                count++;
//                else{
//                    i++;
//                    count++;
//                }
            }else if(i==length){
                i++;
            }

        }
        return count;


    }

}
