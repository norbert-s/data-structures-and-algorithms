package org.sample.recursion;

public class BunnyEars {
    public static void main (String[]args){


    }
    public int bunnyEars(int bunnies) {
        if(bunnies ==0){
            return 0;
        }

        return 2+bunnyEars(bunnies-1);
    }
}
