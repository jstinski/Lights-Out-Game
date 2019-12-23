
/**
 * Abstract class DuoplayPlayer - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class DuoplayPlayer 
{
   protected String name;
   
   public void setName(String name)
   {
     this.name = name;  
   }
   public String getName() 
   {
       return name;
   }
   
   public abstract GameState move(Duoplay game);
   
}
