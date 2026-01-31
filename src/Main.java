import HerancaEPolimorfismo.Employee;
import HerancaEPolimorfismo.Manager;
import HerancaEPolimorfismo.Salesman;

public class Main {
    public static void main(String[] args){
        Employee employee = new Employee();
        Manager manager = new Manager();
        Salesman salesman = new Salesman();

        System.out.println(employee instanceof Employee);
    }
}