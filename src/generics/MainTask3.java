package generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class MainTask3 {
    public static void main(String[] args) {

        City city = new City();
        city.setCode(234);
        city.setName("Eldiyar");

        City city2 = new City();
        city2.setCode(18);
        city2.setName("Eldiyar");

        City city3 = new City();
        city3.setCode(6543);
        city3.setName("Eldiyar");

        City city4 = new City();
        city4.setCode(65);
        city4.setName("Eldiyar");

        City city5 = new City();
        city5.setCode(3);
        city5.setName("Eldiyar");
        TreeSet<City> integers = new TreeSet<>(Comparator.comparingInt(City::getCode).reversed());

        List<City> list = new ArrayList<>(List.of(city,city2,city3,city4,city5));
        for (City city1 : list) {
            if (city1.getCode() % 2 == 0){
                integers.add(city1);
            }
        }
        System.out.println(integers);
//        List<generics.City> list1 = new ArrayList<>(integers);
//        for (generics.City city1 : list1) {
//            System.out.println(city1);
//        }

    }
}
