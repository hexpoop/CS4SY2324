public class Singer{
  public String name;

  private int noOfPeople = 0;
  private static int noOfPerformances;
  private double earnings;

  public Singer(String singername){
    this.name = singername;
  }
  
  public void performForAudience(int noOfPeople){
    noOfPerformances++;
    System.out.println(this.name + " performed a total of " + noOfPerformances + " total!");
    
    earnings = noOfPeople*100;
    System.out.println(this.name + " earned a total of Php" + earnings + "!");
  }

  public void performForAudience(int noOfPeople, Singer SirChloe){
    Singer.noOfPerformances++;
    
    earnings = (noOfPeople*100)/2;
    System.out.println("The two singers earned a total of Php" + earnings + " each!");
  }

  String favoriteSong;
  public void changeFavSong(String favoriteSong){
    System.out.println(this.name+ "'s favorite song is: " + favoriteSong + "!");
  }

  public static int totalPerformances(){
    return Singer.noOfPerformances;
  }
}
