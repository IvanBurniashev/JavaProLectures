package ClassWork._18_09_23;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMapIntegerString = new HashMap<>();
        hashMapIntegerString.put(1,"a;lkjd");
        hashMapIntegerString.put(2,"a;jkls");
        hashMapIntegerString.put(3,"a;aaa");
        hashMapIntegerString.put(4,"a;kkjlf");
        hashMapIntegerString.put(5,"a;sgd");
        hashMapIntegerString.put(6,"a;hhh");

        HashMap<String, String> hashMapStringString = new HashMap<>();
        hashMapStringString.put("vlkkd","a;lkjd");
        hashMapStringString.put("vlkasdfkd","a;jkls");
        hashMapStringString.put("vlkdkd","a;aaa");
        hashMapStringString.put("vlkkjhhd","a;kkjlf");
        hashMapStringString.put("vlkaakd","a;sgd");
        hashMapStringString.put("s","a;hhh");

        Taski task = new Taski();
        task.goThroughTheKeys(hashMapIntegerString);
        System.out.println(task.sumOfLengths(hashMapStringString));
    }
}
