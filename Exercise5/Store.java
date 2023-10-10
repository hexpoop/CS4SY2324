import java.util.*;
import java.util.ArrayList;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    this.name = name;
    this.earnings = 0;
    this.itemList = new ArrayList<Item>();
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }

  public void addItem(Item i){
    this.itemList.add(i);
  }
  
  public void sellItem(int index){
    if (index < itemList.size()){
      itemList.get(index);
      System.out.println("You bought " + itemList.get(index).getName() + "!");
    }
    else {
      System.out.println("There are only " + itemList.size() + " items in this store.");
    }
  }

  public void sellItem(String name){
    boolean found = false;
    for (Item x : itemList){
      if (x.getName().equals(name)){
        earnings += x.getCost();
        System.out.println("You bought " + x.getName() + " for " + x.getCost() + ". :-)");
        found = true;
        break;
      }
    }
    if (found == false){
        System.out.println("This store does not sell " + name + ".");
    }
  }
  
  public void sellItem(Item i){
    boolean found = false;
    for (Item mrbeast : itemList){
      if (mrbeast == i){
        earnings += i.getCost();
        System.out.println("You bought " + i.getName() + " for " + i.getCost() + ". :3");
        found = true;
        break;
      }
    }
    if (found == false) {
        System.out.println("This store does not sell " + i.getName() + ".");
    }
  }
  
  
  public void filterType(String type){
    for (Item i : itemList) {
        if (i.getType() == type){
        System.out.println(i.getName());
      }
    }
  }
  
  public void filterCheap(double maxCost){
    for (Item i : itemList) {
      if (i.getCost() <= maxCost){
        System.out.println(i.getName());
      }
    }
  }
  
  public void filterExpensive(double minCost){
    for (Item i : itemList) {
      if (i.getCost() >= minCost){
        System.out.println(i.getName());
      }
    }
  }
  
  public static void printStats(){
    for (Store i : storeList) {
      System.out.println("Your store, " + i.name + ", earned " + i.earnings + ".");
    }
  }
}
