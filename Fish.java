import java.util.ArrayList;

public class Fish
{

  static ArrayList<String> Fish = new ArrayList<String>();
  int numFishes = 0;
  
    public static int GetNumFishes(ArrayList<String> Fish)
  {
    int numFishes = Fish.size();
    return numFishes;
  }
  public static ArrayList<String> AddFish(String fishName)
  {
    Fish.add(fishName);
    return Fish;
  }
  public static String PrintFishes(ArrayList<String> Fish)
  {
    String x = "";
    for(int i = 0;i < Fish.size(); i++)
    {
    x += Fish.get(i);
    x += ", ";
    }
    return x;
  }
 
