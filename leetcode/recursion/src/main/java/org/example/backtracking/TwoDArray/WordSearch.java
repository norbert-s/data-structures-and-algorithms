package org.example.backtracking.TwoDArray;

import java.util.ArrayList;
import java.util.List;

public class WordSearch {

    char[][] board;
    String word;
    List<String> list = new ArrayList<>();

    public static void main(String[] args) {

        WordSearch wordSearch = new WordSearch();
        char[][] board = {{'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}};
        //char[][] board = {{'a',}};
        System.out.println(wordSearch.exist(board, "ABCCFA"));
    }

    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.word = word;
        for(int row=0;row<board.length;row++){
            for(int column=0;column<board[0].length;column++) {
                existRec(row,column,0);
            }
        }
        if (list.size()>0) return true;
        return false;
    }

    public void existRec( int row, int column, int index) {
        if (index >= word.length()) {
            list.add("found");
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
