package com.example.tictactoe;

/**
 * Created by Ziv on 22/11/2016.
 */

public class TicTacToeGrid {

    private int[][] grid = new int[3][3];
    private int fullTiles =0;
    public TicTacToeGrid()
    {
        for (int x=0; x<3;x++){
            for(int y=0;y<3;y++){
                grid[x][y] = 0;
            }
        }
    }


    // 0 - empty , 1 - X, 2 - O
    public boolean isEmpty(int x, int y){
        return grid[x][y] == 0;
    }

    public void setX(int x, int y){
        fullTiles++;
        grid[x][y]=1;
    }

    public void setO(int x, int y){
        fullTiles++;
        grid[x][y]=2;
    }

    // 0 - returns tie, 1 - X wins, 2 - O wins
    public int checkWin() {

        boolean isDiag1 = true;
        boolean isDiag2 = true;

        // Check diagonal win
        for (int i = 0; i<3;i++) {
            isDiag1 = isDiag1 && grid[i][i] == grid[0][0] && grid[i][i]!=0;

        }
        return -1;
    }
}
