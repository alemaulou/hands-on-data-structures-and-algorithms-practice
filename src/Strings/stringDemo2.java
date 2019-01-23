package Strings;

public class stringDemo2 {
    
    public static void main(String[] args) {
    String userName = "username@domain.edu";
    
    // 1: Print username.
    System.out.println(userName);
    
    // 2: Display how many chars are inside of the userName String data structures.
    System.out.println(userName + " is " + userName.length() + " characters long.");
    
    // 3: Demonstrate the upperCase method message passed to userName String.
    System.out.println(userName.toUpperCase());
    
    // 4: Demonstrate extracting substring from String by passing index arguments into method message parameters.
    System.out.println("The first 3 characters of string are " + userName.substring(0,3));
    
    // 5: Find "charAt" a.k.a. character At given index in String.
    System.out.println("The character at index 3 of string is " + userName.charAt(3));
    
    // 6: Testing out string arguments into parameter using indexOf. Returns 1.
    System.out.println(userName.indexOf("ser"));
    
    // 7: Testing out char input into method parameter. Retains 6.
    System.out.println(userName.indexOf("m"));
    
    }
}
