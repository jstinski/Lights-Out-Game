import java.util.Scanner;
/**
 * Write a description of class LightsOutPlayer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LightsOutPlayer extends DuoplayPlayer
{
    Scanner in = new Scanner(System.in);
    public LightsOutPlayer(String name) {
        this.name = name;   
    }

    public  GameState move(Duoplay game) 
    {
        System.out.print("Row: ");
        //int row = System.in.read();  //Needs an exception handler switching to scanner
        int row = in.nextInt();
        System.out.print("Column: ");
        //int col = System.in.read(); // Needs an exception handler switching to scanner
        int col = in.nextInt();
        LightsOut lo_game =(LightsOut) game;
        lo_game.press(row, col);
        if( lo_game.isDark()) 
        {
            return GameState.WON;
        }
        else 
        {
            return GameState.IN_PROGRESS;
        }
    }
}
