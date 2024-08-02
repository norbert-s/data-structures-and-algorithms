package org.example.stacks_and_queues;

import java.util.*;

public class Brackets {
    static Stack<Character> queue = new Stack<>();
    static Map<Character, Character> map = new HashMap<>();

    static Map<Character, Character> map2 = new HashMap<>();

    public static void main(String[] args) {
        String s = "{{{{";
        System.out.println(solution(s));
    }

    public static int solution(String S) {
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');
        map2.put('}', '{');
        map2.put(']', '[');
        map2.put(')', '(');
        int steps=0;
        if (S.length() == 0) return 1;
        char[] arr = S.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                queue.add(arr[i]);
                steps++;
            } else if (map2.containsKey(arr[i])) {
                if (queue.empty()) return 0;
                else {
                    char c = queue.pop();
                    if (c != map2.get(arr[i])) return 0;
                }
                steps--;
            }
        }
        if(steps!=0)return 0;
        return 1;
    }
}
//A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:
//
//S is empty;
//S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
//S has the form "VW" where V and W are properly nested strings.
//For example, the string "{[()()]}" is properly nested but "([)()]" is not.
//
//Write a function:
//
//class Solution { public int solution(String S); }
//
//that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.
//
//For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the function should return 0, as explained above.
//
//Write an efficient algorithm for the following assumptions:
//
//N is an integer within the range [0..200,000];
//string S is made only of the following characters: "(", "{", "[", "]", "}" and/or ")".
//Copyright 2009–2023 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.