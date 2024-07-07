import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);

        // concatenation
        String firstnam = sc.nextLine();
        String lastnam = sc.nextLine();
        String fullname = firstnam + "#" + lastnam;
        System.out.println(fullname);
        // char at
        for (int i = 0; i < fullname.length(); i++) { // .length is used to set correct bounds to loop.
            System.out.println(fullname.charAt(i));
        }
        // in strings to compare 2 strings we use .compare to command because == will
        // fail here. if the start alphabet is high then it is bigger.
        // this case can be understood in string builder.
    }
}