import java.util.*;

public class ListPractice {


  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    List<String> listExample = new ArrayList<>();
    System.out.println(listExample);

    // Add 3 elements to the list (OK to do one-by-one)
    listExample.add("Hello");
    listExample.add("Java");
    listExample.add("Derusting");
    System.out.println(listExample);

    // Print the element at index 1
    System.out.println(listExample.get(1));

    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    listExample.set(1, "ArrayList");
    System.out.println(listExample);

    // Insert a new element at index 0 (the length of the list will change)
    listExample.add(0, "Assignment:");
    System.out.println(listExample);

    // Check whether the list contains a certain string
    if (listExample.contains("Hello")) {
      System.out.println("Yes! It has the element Hello");
    }

    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line
    for (int i = 0; i < listExample.size(); i++) {
      System.out.println(i + "=" + listExample.get(i));
    }

    // Sort the list using the Collections library
    Collections.sort(listExample);
    System.out.println(listExample);

    // Iterate over the list using a for-each loop
    // Print each value on a second line
    for (String word : listExample) {
      System.out.println(word);
    }

    /*
     * Usage tip!
     * 
     * Use a traditional for-loop when you need to use the index or you need to iterate in an
     * unconventional order (e.g. backwards)
     * 
     * Otherwise, if you're iterating the in the conventional order and don't need the
     * index values a for-each loop is cleaner.
     */
  }
}