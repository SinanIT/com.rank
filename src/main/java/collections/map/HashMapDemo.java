package collections.map;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap m = new HashMap();
        //HashMap<Integer, String> m = new HashMap<>();
        m.put(101, "John");
        m.put(102, "David");
        m.put(103, "Scott");
        m.put(104, "Mary");
        m.put(105, "Tye");
        m.put(103, "X");
        m.put(105, "David");

        System.out.println(m); // {101=John, 102=David, 103=X, 104=Mary, 105=Tye}

        //retrieve a value
        System.out.println(m.get(105)); //Tye


    }
}
