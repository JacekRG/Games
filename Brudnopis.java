package games.parts;

import java.util.HashSet;
import java.util.Set;

public class Brudnopis {
    public static void main(String[] args) {
        Set<Integer> firstHS = new HashSet<>();
        firstHS.add(2);
        firstHS.add(5);
        firstHS.add(9);

        HashSet<Integer> secondHS = new HashSet<>();
        secondHS.add(5);
        secondHS.add(9);
        secondHS.add(2);



        System.out.println("Compare: " + firstHS.equals(secondHS));
    }
}
