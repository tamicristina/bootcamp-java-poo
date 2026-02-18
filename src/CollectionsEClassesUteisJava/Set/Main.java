package CollectionsEClassesUteisJava.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<User> users = new HashSet<>();
        users.add(new User(1, "João"));
        users.add(new User(2, "Tamires"));
        users.add(new User(3, "Vitória"));
        users.add(new User(4, "Nara"));

        System.out.println(users.contains(new User(1, "Tamires")));
        users.forEach(System.out::println);
        users.removeAll(List.of(new User(1, "Tamires"), new User(2, "Cristina")));

    }
}
