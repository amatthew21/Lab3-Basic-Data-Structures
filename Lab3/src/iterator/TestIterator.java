package iterator;

import java.util.*;

public class TestIterator {
  public static void main(String[] args) {
    Collection<String> collection = new LinkedList<>();
    collection.add("New York"); 
    collection.add("Atlanta"); 
    collection.add("Dallas"); 
    collection.add("Madison"); 

    var iterator = collection.iterator();
    for (var i : collection) {
      System.out.print(i.toLowerCase() + ", ");
    }
    System.out.println();
  }
}