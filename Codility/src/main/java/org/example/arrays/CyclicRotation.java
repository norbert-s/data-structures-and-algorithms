package org.example.arrays;

public class CyclicRotation {
    public static void main(String[]args){
        int [] tomb = {1,2,3,4,5};
        int K =3;
        tomb = rotate(tomb,K);
        for(int i:tomb){
            System.out.println(i);
        }
    }

    public static int[] rotate(int[]tomb,int eltolas){
        int length = tomb.length;
        if(length==0) return tomb;
        int [] result = new int [length];
        int maradek = eltolas%length;
        for(int i=0;i<length;i++){
            if((maradek+i)<=(length-1))
                result [i+maradek] = tomb[i];
            else{
                int surplus = (maradek+i) - (length-1);
                result [surplus-1] = tomb[i];
            }

        }
        return result;
    }
}
