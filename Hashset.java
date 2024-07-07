
//We use this hashset bcz here the tc of search,delete,insert will be O(1).
// In array for search O(n) for insert O(1) for delete O(n).
import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        // create hashset
        HashSet<Integer> set = new HashSet<>();
        // Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        // Size
        System.out.println(set.size());
        System.out.println(set);
        // search-contains
        if (set.contains(1)) {
            System.out.println("It has");
        }
        if (!set.contains(6)) {
            System.out.println("It has not");

        }
        // Delete
        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("Does not have");
        }
        // Iterator- for set there will be no index to to treverse the elements in set
        // we use iterator.
        Iterator it = set.iterator();
        // hasNext; next these are 2 functions in iterator.
        // .next will take us to next element and hasNext will just give true or false
        // if there is a element after it gives T else F.
        while (it.hasNext()) { // until it has hasNext() we print .next().
            System.out.println(it.next());
        }
    }
}