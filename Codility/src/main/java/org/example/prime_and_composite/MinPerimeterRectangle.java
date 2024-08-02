package org.example.prime_and_composite;

public class MinPerimeterRectangle {
    public static void main(String[] args) {
        System.out.println(solution(1));
    }
    static public int solution(int N) {
        int minPerimeter = Integer.MAX_VALUE;
        for(int i=1;i<=(N/2)+1;i++){
            if(N%i==0){
                int perimeter = 2*(i+(N/i));
                if(perimeter<minPerimeter){
                    minPerimeter = perimeter;
                }
            }
        }
        return minPerimeter;
    }
}
