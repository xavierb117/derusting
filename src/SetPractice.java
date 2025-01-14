import java.util.*;

public class SetPractice {
  public static void main(String[] args) {
    // Create a HashSet of Strings and assign it to a variable of type Set
    Set<String> setExample = new HashSet<>();
    System.out.println(setExample);

    // Add 3 elements to the set
    // (It's OK to do it one-by-one)
    setExample.add("Hello");
    setExample.add("Set");
    setExample.add("Practice");
    System.out.println(setExample);

    // Check whether the Set contains a given String
    if (setExample.contains("Hello")) {
      System.out.println("Yes! It does contain Hello");
    }

    // Remove an element from the Set
    setExample.remove("Hello");
    System.out.println(setExample);

    // Get the size of the Set
    System.out.println(setExample.size());

    // Iterate over the elements of the Set, printing each one on a separate line
    for (String word : setExample) {
      System.out.println(word);
    }

    /*
     * Warning!
     * 
     * The iteration order over the items in a HashSet is NOT GUARANTEED.
     * 
     * Even running the exact same program multiple times may give different results.
     * Do not use a HashSet if order is important! You can use a TreeSet if you
     * want items in sorted order, or an array or List if you want them in a specified
     * order.
     * 
     * Also remember that sets do NOT have duplicates.
     */
  }
}
