package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> vissza = new LinkedList<>();
        int alice = 0;
        int bob = 0;
        for(int i=0;i<3;i++){
            if(a.get(i)>b.get(i)){
                alice++;
            }
            else if (b.get(i)>a.get(i)){
                bob++;
            }
        }
        vissza.add(alice);
        vissza.add(bob);
        return vissza;
    }
}
