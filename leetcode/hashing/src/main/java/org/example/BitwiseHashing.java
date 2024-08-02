package org.example;

public class BitwiseHashing {
    public static void main(String[] args) {
        char [] arr = {'f','i','n','d','i','n','g'};
        int h=0,x=0;

        for(int i=0;i<arr.length;i++){
            x=1;

            x = x<<arr[i]-97;
            if((x&h)>0){
                System.out.println("duplicate "+arr[i]);
            }else{
                h = x | h;
            }
        }
    }
}
