package org.example.medium;

public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverse(12300));
    }
    public int reverse(int x) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        String num = String.valueOf(x);
        StringBuilder newStr = new StringBuilder();
        int counterOfZeros = 0;
        int counterBackward = 0;
        int stop=0;
        if(num.length()==0)return 0;

        if(num.charAt(0)=='-'){
            newStr.append('-');
            stop=1;
        }

        for(int i=num.length()-1;i>=stop;i--){
            char nextChar = num.charAt(i);
            if(nextChar=='0'&&counterOfZeros==counterBackward){
                counterOfZeros++;
            }else{
                newStr.append(num.charAt(i));
            }
            counterBackward++;
        }
        if(newStr.length()==0) return 0;
        int val=0;
        try{
            val = Integer.valueOf(newStr.toString());
        }catch (NumberFormatException ne){
            return 0;
        }

        if(val<min||val>max) return 0;
        return Integer.valueOf(newStr.toString());
    }
}
