import java.util.HashSet;
import java.util.Set;

// Разработать программу, имитирующую поведение коллекции HashSet. В программе содать метод add добавляющий элемент, и метод позволяющий выводить эллементы коллекции в консоль. Формат данных Integer.


public class App {
    public static void main(String[] args) throws Exception {
        Set<Integer> set = new HashSet<>();
        set.add(111);
        set.add(123);
        set.add(555);
        set.add(12);
        set.add(50); 
        System.out.println(set);
        for (var item: set) System.out.println(item);
    }
    

}
