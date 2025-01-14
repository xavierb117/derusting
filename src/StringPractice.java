import java.util.ArrayList;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String word = "Hello";
    System.out.println(word);
  
    // Find the length of the string
    System.out.println(word.length());

    // Concatenate (add) two strings together and reassign the result
    word = word + " World";
    System.out.println(word);

    // Find the value of the character at index 3
    System.out.println(word.charAt(3));

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    if (word.contains("Hel")) {
      System.out.println("Yes! The word contains the substring");
    }

    // Iterate over the characters of the string, printing each one on a separate line
    for (int i = 0; i < word.length(); i++) {
      System.out.println(word.charAt(i));
    }

    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> stringList = new ArrayList<>();
    System.out.println(stringList);

    // Add multiple strings to the List (OK to do one-by-one)
    stringList.add("Hello");
    stringList.add("String");
    stringList.add("Practice");
    System.out.println(stringList);

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    System.out.println(String.join(",", stringList));

    // Check whether two strings are equal
    if (stringList.get(0).equals(stringList.get(1))) {
      System.out.println("Yes they are the same!");
    }
    else {
      System.out.println("No they are different!");
    }

    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
