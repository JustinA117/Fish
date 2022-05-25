import java.util.ArrayList;


public class Tester
{
  public static void main(String[] args)
  {
    
    ArrayList<String> fishMain = Fish.AddFish("Salmon");
    fishMain = Fish.AddFish("Walrus");
    String bannana = Fish.PrintFishes(fishMain);
    System.out.println(bannana);
    int num = Fish.GetNumFishes(fishMain);
    System.out.println("There are " + num + " fishes");
  }

  
  
}
