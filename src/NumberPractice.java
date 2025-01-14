public class NumberPractice {
  public static void main(String args[]) {
    // Create a float with a negative value and assign it to a variable
    float floatNum = -3.5f;
    System.out.println(floatNum);

    // Create an int with a positive value and assign it to a variable
    int intNum = 3;
    System.out.println(intNum);

    // Use the modulo % operator to find the remainder when the int is divided by 3
    System.out.println("The remainder of the int is: " + intNum % 3);

    // Use the modulo % operator to determine whether the number is even
    // (A number is even if it has a remainder of zero when divided by 2)
    // Use an if-else to print "Even" if the number is even and "Odd"
    // if the number is odd.
    if (intNum % 2 == 0) {
      System.out.println("Even");
    }
    else {
      System.out.println("Odd");
    }

    // Divide the number by another number using integer division
    System.out.println(intNum / 2);

    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */

  }
}
