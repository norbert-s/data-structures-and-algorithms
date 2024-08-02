package org.example.backtracking.TwoDArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordSearchII {

    char[][] board;
    String word;
    List<String> list = new ArrayList<>();

    Set<String> set = new HashSet<>();

    public static void main(String[] args) {

        WordSearchII wordSearch = new WordSearchII();
        char[][] board = {
                {'o','a','a','n'},
                {'e','t','a','e'},
                {'i','h','k','r'},
                {'i','f','l','v'}};
        String [] words = {"oath","pea","eat","rain"};
    }

    public List<String> findWords(char[][] board, String[] words) {


        for(String i:words){
            this.board = board;
            this.word = i;
            System.out.println(i);
            for(int row=0;row<board.length;row++){
                for(int column=0;column<board[0].length;column++) {
                    existRec(row,column,0);
                }
            }
        }

        return list;
    }

    public void existRec( int row, int column, int index) {
        if (index >= word.length()) {
            if(!set.contains(word)){
                list.add(word);
                set.add(word);
            }
            return ;
        }
        if (row >= board.length || column >= board[0].length || row < 0 || column < 0 ) {
            return;
        }
        if(word.charAt(index)!=board[row][column])
            return;
        if(String.valueOf(board[row][column]).equals(String.valueOf(word.charAt(index)))){
            char origBoard =  board[row][column];
            board[row][column] = 'X';
            existRec(row+1,column,index+1);
            existRec(row,column+1,index+1);
            existRec(row-1,column,index+1);
            existRec(row,column-1,index+1);
            board[row][column] = origBoard;
        }
    }
}
