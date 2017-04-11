package pirates;

import java.util.*;

//public class PirateCounter {

public class Pirate {
  String name;
  boolean hasWoodenLeg;
  int gold;

  Pirate(String name, boolean hasWoodenLeg, int gold) {
    this.name = name;
    this.hasWoodenLeg = hasWoodenLeg;
    this.gold = gold;
  }

  public void pirateList(){
    ArrayList<Pirate> pirates = new ArrayList<>();
 //   Pirate Olaf = new Pirate("Olaf", false, 12);
    pirates.add(new Pirate("Olaf", false, 12));
    pirates.add(new Pirate("Uwe", true, 9));
    pirates.add(new Pirate("Jack", true, 16));
    pirates.add(new Pirate("Morgan", false, 17));
    pirates.add(new Pirate("Hook", true, 20));
  }
  public void woodLegs(ArrayList pirates) {

    for (int i = 0; i < pirates.size(); i++) {
      if (pirates.get(i)) {
        System.out.println(pirates.get(i));
      }
    }
  }

  public static void main(String... args) {
       // Given this list...
    ArrayList<Pirate> pirates = new ArrayList<>();
    //   Pirate Olaf = new Pirate("Olaf", false, 12);
    pirates.add(new Pirate("Olaf", false, 12));
    pirates.add(new Pirate("Uwe", true, 9));
    pirates.add(new Pirate("Jack", true, 16));
    pirates.add(new Pirate("Morgan", false, 17));
    pirates.add(new Pirate("Hook", true, 20));

    // Write a function that takes any list that contains pirates as in the example,
    // And returns a list of names containing the pirates that
    // - have wooden leg and
    // - have more than 15 gold
    Pirate Olaf = new Pirate("Olaf", false, 12);

    for (int i = 0; i < pirates.size(); i++) {
      if (pirates.get(i).hasWoodenLeg) {
        System.out.println(pirates.get(i).name);
      }
    }

    for (int i = 0; i < pirates.size(); i++) {
      if (pirates.get(i).gold > 15) {
        System.out.println(pirates.get(i).name);
      }
    }



  }


}




