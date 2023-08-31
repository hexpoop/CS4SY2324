/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PHOTON
 */
public class Exercise1 {
    public static void main(String[] args) {
    String char1 = "Butters Stotch";
    int age1 = 10;
    int study1 = 5;
    String va1 = "Matt Stone";

    String char2 = "Ike Broflovski";
    int age2 = 5;
    int study2 = 1;
    String va2 = "Matt Stone";

    String char3 = "Tammy Warner";
    int age3 = 11;
    int study3 = 6;
    String va3 = "Mickey Ramos";

    // Operations >_<
    int sum = age1 + age2 + age3;
    boolean years = study1 > study3;
    boolean voice = va1 == va2;

    // Printing everything together :3
    System.out.println("Character 1" + "\n" + "Name: " + char1 + "\n" + "Age: " + age1 + "\n" + "Years of Study: " + study1 + "\n" + "Original Voice Actor: " + va1 + "\n");

    System.out.println("Character 2" + "\n" + "Name: " + char2 + "\n" + "Age: " + age2 + "\n" + "Years of Study: " + study2 + "\n" + "Original Voice Actor: " + va2 + "\n");

    System.out.println("Character 3" + "\n" + "Name: " + char3 + "\n" + "Age: " + age3 + "\n" + "Years of Study: " + study3 + "\n" + "Original Voice Actor: " + va3 + "\n");

    System.out.println("The sum of all characters' Ages are: " + sum);
    System.out.println("Whether Butters Stotch has studied longer than Tammy Warner: " + years);
    System.out.println("Whether Ike and Butters have the same Original Voice Actor: " + voice);
  }
}
