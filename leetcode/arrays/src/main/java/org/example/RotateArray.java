package org.example;

public class RotateArray {

    public static void main(String[]args) {
        int[] tomb = {1, 2, 3, 4, 5};
        int K = 2;
        rotate(tomb, K);
        for (int i : tomb) {
            System.out.println(i);
        }
    }
    public static void rotate(int[] tomb, int eltolas) {
        int length = tomb.length;

        int [] result = new int [length];
        int maradek = eltolas%length;
        if(maradek==0){}
        else{
            for(int i=0;i<length;i++){
                if((maradek+i)<=(length-1))
                    result [i+maradek] = tomb[i];
                else{
                    int surplus = (maradek+i) - (length-1);
                    result [surplus-1] = tomb[i];
                }

            }
            for(int i=0;i<length;i++){
                tomb[i]=result[i];
            }
        }


    }
}
