public class Main{
  public static void main(String[] args){
    Character Butters = new Character();
    Butters.name = "Butters Stotch";
    Butters.age = 10;
    Butters.va = "Matt Stone";

    Character Ike = new Character();
    Ike.name = "Ike Broflovski";
    Ike.age = 5;
    Ike.va = "Matt Stone";

    Character Tammy = new Character();
    Tammy.name = "Tammy Warner";
    Tammy.age = 11;
    Tammy.va = "Mickey Ramos";

    Song Amoeba = new Song();
    Amoeba.songname = "Amoeba";
    Amoeba.songmins = 3.73;

    Song Zinnias = new Song();
    Zinnias.songname = "Zinnias";
    Zinnias.songmins = 2.9;

    Singer Clairo = new Singer("Clairo");
    
    Clairo.changeFavSong("yoshi's island");
    Clairo.performForAudience(12);
    Clairo.changeFavSong("ASAP");
  }
}
