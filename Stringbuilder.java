
// String builde is mutable.
// strings are immutable. it means if we have made string in the memory we cannot change.
import java.util.*;

public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Ash");
        System.out.println(sb);

        // charAt
        System.out.println(sb.charAt(1));
        // set charAt
        // In Java, the setCharAt method of the StringBuilder class requires a char as
        // its second argument, not a String.
        // This is because char represents a single character, whereas String can
        // represent a sequence of characters.
        sb.setCharAt(2, 'm'); // here we should give '' not " " which becomes string.
        System.out.println(sb);
        // Insert
        System.out.println(sb.insert(2, 'u'));
        // Delete
        // here we want both start and end
        System.out.println(sb.delete(2, 3));
        // append
        System.out.println(sb.append('I'));
        // reverse
        System.out.println(sb.reverse());
        System.out.println(sb.substring(sb.length() - 1));
        // pop cant be used here

    }

    // question- to reverse a string
    public class ReverseString {
        public static void main(String[] args) {
            String str = "Hello, World!";
            StringBuilder sb = new StringBuilder(str);
            String reversedStr = sb.reverse().toString();
            System.out.println(reversedStr);
        }
    }

}
