package Strings;
/* 
 * Using String Data Structure for Word Processing
 * Review methods for manipulating Strings.
 * 
 * String class:
 * Data type used for storing sequences of characters.
 * char is a primitive data type stores one character.
 * String class - part of the java.lang package.
 * Derived from object class.
 */

public class stringDemo {
    public static void main(String[] args) {
        String str1 = "My first string";
        String str2 = ("My Second String"); // encapsulating in set of parentheses, not necessary.
        String str3 = new String ("My last string"); // this is redundant
        
        // Concatenation
        String str4 = str1 + "\n" + str2 + "\n" + str3;
        
        System.out.println(str4);
    }

}
