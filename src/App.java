import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Разработать программу, имитирующую поведение коллекции HashSet. В программе содать метод add добавляющий элемент, и метод позволяющий выводить эллементы коллекции в консоль. Формат данных Integer.


// public class App {
//     public static void main(String[] args) throws Exception {
//         Set<Integer> set = new HashSet<>();
//         set.add(111);
//         set.add(123);
//         set.add(555);
//         set.add(12);
//         set.add(50); 
//         System.out.println(set);
//         for (var item: set) System.out.println(item);
//     }
    

// }

public class App {
    private static HashMap<Integer, Object>hMap = new HashMap<>();
    private static final Object OBJECT = new Object();
    public static void main(String[] args) throws Exception {
        add(65);
        add(5);
        add(45);
        add(45);

        System.out.println(hMap.keySet());
        System.out.println(getString());
        System.out.println(isEmpty());
        System.out.println(gettKey(0));
        System.out.println(gettKey(110));

        Iterator<Integer>iterator = hMap.keySet().iterator();
        while (iterator.hasNext()) {
        System.out.println(iterator.next());
        }
        try {
            System.out.println(gettKey(110));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Object[] tmp = hMap.keySet().toArray();

        for (Map.Entry<Integer, Object> entry: hMap.entrySet()) {
            System.out.println(entry.getKey());
        }

    }

    private static int gettKey(int num) {
        return (Integer)hMap.keySet().toArray()[num];
    }

    public static void add(Integer numbers) {
        hMap.put(numbers, OBJECT);
    }
    private static String getString() {
        return hMap.keySet().toString();
    }

    private static boolean isEmpty() {
        return hMap.isEmpty();
    }
    
}





