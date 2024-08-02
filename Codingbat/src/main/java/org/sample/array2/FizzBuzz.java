package org.sample.array2;

public class FizzBuzz {
    public String[] fizzBuzz(int start, int end) {
        String[] tomb = new String[end - start];
        int counter = start;
        for (int i = 0; i < end - start; i++) {
            if (counter % 3 == 0 && counter % 5 == 0) {
                tomb[i] = "FizzBuzz";
            } else if (counter % 3 == 0) {
                tomb[i] = "Fizz";
            } else if (counter % 5 == 0) {
                tomb[i] = "Buzz";
            } else {
                tomb[i] = String.valueOf(counter);
            }
            counter++;
        }
        return tomb;
    }


}
