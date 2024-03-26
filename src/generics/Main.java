package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Integer> numbers= new ArrayList<>(List.of(1,2,3,4,5));
        lastElement(numbers,20);
        System.out.println("List numbers : " + numbers);

    }
    public  static <T> void lastElement(List<T> collection,T lastElement){
        T last = null;
        for (T element: collection) {
            last = element;
        }
        collection.remove(last);
        collection.add(lastElement);
    }
}