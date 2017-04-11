package countas;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

/**
 * Created by HP on 4/11/2017.
 */
public class CountAs {
  public static void main(String[] args) {
    Path fileAddress = Paths.get("assets/afile.txt");
    String lineString = "";
    try {
      List<String> lines = Files.readAllLines(fileAddress);
      for (int i = 0; i < lines.size(); i++) {
        lineString = lines.get(i);
        System.out.println(lineString);
      }
    } catch (Exception e) {
    }
    HashMap result = myDictionary(lineString.toLowerCase());
    System.out.println(result.get('a'));
  }

  public static HashMap myDictionary(String myString) {
    HashMap<Character, Integer> myHasmap = new HashMap<>();
    for (int i = 0; i < myString.length(); i++) {
      if (myHasmap.containsKey(myString.charAt(i))) {
        myHasmap.put(myString.charAt(i), myHasmap.get(myString.charAt(i)) + 1);
      } else {
        myHasmap.put(myString.charAt(i), 1);
      }
    }
    return myHasmap;
  }
}
