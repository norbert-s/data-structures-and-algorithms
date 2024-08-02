package org.example.time_complexity;

public class FrogJump {
    public static void main (String [] args){
        int jumpsNeeded = frogJump(10,85,30);
        System.out.println();

    }
    public static int frogJump(int X, int Y,int D){
        if( (Y-X)%D==0) return (Y-X)/D;
        else{
            return ((Y-X)/D)+1;
        }
    }
}
