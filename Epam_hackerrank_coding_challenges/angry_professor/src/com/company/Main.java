package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    // Complete the angryProfessor function below.
    static String angryProfessor(int k, int[] a) {
        int cp =0;
        int cm=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<=0){
                cm++;
            }
            else{
                cp++;
            }
        }
        if(cm<k){
            return "YES";
        }
        else{
            return "NO";
        }

    }
}
