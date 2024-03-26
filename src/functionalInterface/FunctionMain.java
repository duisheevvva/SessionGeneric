package functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionMain {
    public static void main(String[] args) {
//        TODO 1
        Function<String, Integer> stringToInteger = Integer::parseInt;
        System.out.println(" String to integer : " + stringToInteger.apply("12345"));

//        TODO 2
        Function<List<String>, List<Integer>> listFunction =
                strings -> {
                    List<Integer> newList = new ArrayList<>();
                    for (String string : strings) {
                        newList.add(string.length());
                    }
                    return newList;
                };
        System.out.println("List lengths : " + listFunction.apply(List.of("Bektur","Nurmuhamed","Adyl")));


    }
}
