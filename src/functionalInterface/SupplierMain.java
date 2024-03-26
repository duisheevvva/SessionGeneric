package functionalInterface;

import java.util.Date;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierMain {
    public static void main(String[] args) {
//        TODO 1
        Supplier<Integer> randomSupplier = () -> new Random().nextInt(1,10);
        System.out.println("Random san : " + randomSupplier.get() );

//        TODO 2
        Supplier<Date> currentTime= Date::new;
        System.out.println("Current Date: " + currentTime.get());

    }
}
