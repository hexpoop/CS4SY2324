public class Singer{
  String name;

  int noOfPeople = 0;
  int noOfPerformances;
  double earnings;

  public Singer(String singername){
    this.name = singername;
  }
  
  public void performForAudience(int noOfPeople){
    noOfPerformances++;
    System.out.println("This singer performed a total of " + noOfPerformances + " total!");
    
    earnings += noOfPeople*100;
    System.out.println("This singer earned a total of " + earnings + "!");
  }

  String favoriteSong;
  public void changeFavSong(String favoriteSong){
    System.out.println("This singer's favorite song is: " + favoriteSong + "!");
  }
}
