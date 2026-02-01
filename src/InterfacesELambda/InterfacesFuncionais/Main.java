package InterfacesELambda.InterfacesFuncionais;

import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args){
        List<User> users = List.of(new User("Maria", 21), new User("Joao", 31), new User("Ana", 19));

        users.forEach(new Consumer<User>(){
            @Override
            public void accept(final User user){
                System.out.println(user);
            }
        });
    }
}