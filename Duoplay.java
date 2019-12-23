
/**
 * Abstract class Duoplay - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Duoplay
{
    DuoplayPlayer player1;
    DuoplayPlayer player2;
    public Duoplay (DuoplayPlayer player1, DuoplayPlayer player2) 
    {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() 
    {
        GameState gs = GameState.IN_PROGRESS;
        while(gs == GameState.IN_PROGRESS) 
        {
            System.out.println(toString());
             gs = player1.move(this);
            System.out.println(toString());
            if(gs == GameState.WON) 
            {
                System.out.print(player1.getName() + " Won!");
                break;
            }
            else if(gs == GameState.DRAW) 
            {
                System.out.print("It's a draw!");
                break;
            }
            System.out.println(toString());
            gs = player2.move(this);
            System.out.println(toString());
            if(gs == GameState.WON) 
            {
                System.out.print(player2.getName() + " Won!");
            }
            else if(gs == GameState.DRAW) 
            {
                System.out.print("It's a draw!");
            }
        }
    }
}
