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
            for(int y=0;x<3;y++){
                grid[x][y] = 0;
            }
        }
    }

    public boolean isEmpty(int x, int y){
        return grid[x][y] == 0;
    }

    public void setX(int x, int y){
        fullTiles++;
        grid[x][y]=1;
        x = 2;
    }

    public void setO(int x, int y){
        fullTiles++;
        grid[x][y]=2;
    }

    public int checkWin() {

        boolean isDiag1 = true;
        boolean isDiag2 = true;
        boolean line1 = true;
        boolean line2 = true;
        boolean line3 = true;
        boolean column1 = true;
        boolean column2 = true;
        boolean column3 = true;


        // Check diagonal win
        for (int i = 0; i<3;i++)
        {
            isDiag1 = isDiag1 && grid[i][i] == grid[0][0] && grid[i][i]!=0;
        }

        if (isDiag1)
        {
            return 1;
        }
        for (int i = 0; i<3;i++)
        {
            isDiag2 = isDiag2 && grid[2-i][i] == grid[2][0] && grid[2-i][i]!=0;
        }

        if (isDiag2)
        {
            return 2;
        }

        if (column1)
        {
            return 3;
        }
        // Check column number two
        for (int i = 0; i < 3; i++)
        {
            column2 = column2 && grid[i][1] == grid[0][1] && grid[i][1]!=0;
        }
        if (column2)
        {
            return 4;
        }
        // Check column number three
        for (int i = 0; i < 3; i++)
        {
            column3 = column3 && grid[i][2] == grid[0][2] && grid[i][2]!=0;
        }
        if (column3)
        {
            return 5;
        }

        // Check line number one
        for (int i = 0; i < 3; i++)
        {
            line1 = line1 && grid[0][i] == grid[0][0] && grid[0][i]!=0;
        }
        if (line1)
        {
            return 6;
        }

        // Check line number two
        for (int i = 0; i < 3; i++) {
            line2 = line2 && grid[1][i] == grid[1][0] && grid[1][i] != 0;
        }
        if (line2)
        {
            return 7;
        }

        // Check line number three
        for (int i = 0; i < 3; i++)
        {
            line3 = line3 && grid[2][i] == grid[2][0] && grid[2][i]!=0;
        }
        if (line3)
        {
            return 8;
        }
        // Check column number one
        for (int i = 0; i < 3; i++)
        {
            column1 = column1 && grid[i][0] == grid[0][0] && grid[i][0]!=0;
        }



        return -1;
    }
}
