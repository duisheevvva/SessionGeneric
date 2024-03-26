package functionalInterface;

import java.util.function.Predicate;

public class MainPredicate {
    public static void main(String[] args) {
//        TODO 1
        Predicate<Integer> isTrue = n -> {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;

        }; System.out.println(" San 17 : " +isTrue.test(11));



    }
}
