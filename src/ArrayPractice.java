import java.util.*;
public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] arrayExample = new String[4];
    System.out.println(Arrays.toString(arrayExample));

    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    arrayExample[0] = "Hello";
    arrayExample[1] = "To";
    arrayExample[2] = "Java";
    arrayExample[3] = "Derusting";
    System.out.println(Arrays.toString(arrayExample));

    // Get the value of the array at index 2
    System.out.println(arrayExample[2]);

    // Get the length of the array
    System.out.println(arrayExample.length);

    // Iterate over the array using a traditional for loop and print out each item
    for (int i = 0; i < arrayExample.length; i++) {
      System.out.println(arrayExample[i]);
    }

    // Iterate over the array using a for-each loop and print out each item
    for (String word : arrayExample) {
      System.out.println(word);
    }

    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
