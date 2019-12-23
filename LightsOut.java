import java.util.Random;
/**
 * Write a description of class LightsOut here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LightsOut extends Duoplay
{
    Random rand = new Random();
    boolean[][] board;

    public LightsOut (LightsOutPlayer player1, LightsOutPlayer player2, int size) 
    {
        super (player1, player2);
        //board = new boolean[size][size];
        //randomize();
        //board = new boolean [][]{{false,true,false},{true,true, true},{false,true,false}};
        board = new boolean [][]{{true,false,false},{false,true, true},{false,true,false}};
    }

    public void randomize()
    {
        for(int i = 0; i < board.length; i++) 
        {
            for(int j = 0; j < board[i].length; j++) 
            {
                board[i][j] = rand.nextBoolean();
            }
        }
    }

    public void press (int row, int col) 
    {
        board[row][col] = !board[row][col];
        if(row-1 >= 0) 
        {
            board[row-1][col] = !board[row-1][col];
        }
        if(row+1 <= board.length-1) 
        {
            board[row+1][col] = !board[row+1][col]; 
        }
        if(col-1 >= 0) 
        {
            board[row][col-1] = !board[row][col-1];
        }
        if(col+1 <= board.length-1) 
        {
            board[row][col+1] = !board[row][col+1];
        }
    }

    public boolean isDark() 
    {
        for(int i = 0; i < board.length; i++) 
        {
            for(int j = 0; j < board[i].length; j++) 
            {  
                if(board[i][j]) 
                {
                    return false;
                }
            }
        }
        return true;
    }

    public String toString()
    {
        String result = "";
        for(int i = -1; i < board.length; i++) 
        {
            for(int j = -1; j < board.length; j++) 
            { 
                if(i == -1) 
                {
                    if(j == -1) 
                    {
                        result = result + " ";
                    }
                    else
                    {
                        result = result + j;
                    }
                }
                else 
                {
                    if(j == -1) 
                    {
                        result = result + i;
                    }
                    else
                    {
                        if(board[i][j]) 
                        {                        
                        result = result + "x";
                    }
                    else
                    {                       
                        result = result + "_";
                    }
                    }
                }
            }
            result = result + "\n";
        }
        return result;
    }
}
