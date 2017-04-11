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


    //     woodLegs(pirates);
  }

  public void woodLegs() {

  //  for (int i = 0; i < myList.size(); i++) {
      //   if ( list.equals(true)) {
      //     System.out.println(myList.get(i));
      //   }

 //   }

  }
}


//  public static HashMap pirateGoldList(ArrayList myList) {
//    HashMap<Character, Integer> myHasmap = new HashMap<>();
//    for (int i = 0; i < myString.length(); i++) {
//      if (myHasmap.containsKey(myString.charAt(i))) {
//        myHasmap.put(myString.charAt(i), myHasmap.get(myString.charAt(i)) + 1);
//      } else {
//        myHasmap.put(myString.charAt(i), 1);
//      }
//    }
//    return myHasmap;
//  }


//}

