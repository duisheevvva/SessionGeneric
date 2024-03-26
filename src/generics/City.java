package generics;

import java.util.Comparator;
import java.util.TreeSet;

public class City {
    private String name ;
    private int code;


    public City() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "\ngenerics.City{" +
                "name='" + name + '\'' +
                ", code=" + code +
                '}';
    }
}
