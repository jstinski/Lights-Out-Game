
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver
{
    public static void main (String[] args) 
    {
       LightsOutPlayer Player1 = new LightsOutPlayer("Dan");
       LightsOutPlayer Player2 = new LightsOutPlayer("Joe");
       
       LightsOut game = new LightsOut(Player1, Player2, 2);
       game.play();
    }
}
