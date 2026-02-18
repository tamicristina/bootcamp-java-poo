package CollectionsEClassesUteisJava.ListasEArrays;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] codes = {789, 852};
        System.out.println(codes.length);
        List<Integer> codes2 = new ArrayList<>();
        codes2.add(codes[0]);
        codes2.add(codes[1]);
        codes2.forEach(System.out::println);
        codes2.add(7498);

    }
}
