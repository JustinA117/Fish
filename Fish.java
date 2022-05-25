import java.util.ArrayList;

public class Fish
{
// The initialization of the variables
  static ArrayList<String> Fish = new ArrayList<String>();
  int numFishes = 0;
  //returns how manu Strings are in the array
    public static int GetNumFishes(ArrayList<String> Fish) 
  {
    int numFishes = Fish.size();
    return numFishes;
  }
  // add a String that contains a fish to the array
  public static ArrayList<String> AddFish(String fishName)
  {
    Fish.add(fishName);
    return Fish;
  }
  // Returns one big String of each singular String in the array separated by a comma
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
 
