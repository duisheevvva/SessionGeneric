package generics;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> {
    private List<T> list = new ArrayList<>();

    public MyStack() {
    }

    public MyStack(List<T> list) {
        this.list = new ArrayList<>();
    }

    public List<T> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "generics.MyStack{" +
                "list=" + list +
                '}';
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public void push(T element) {
        list.add(element);
    }

    public T peek() {
        T element = null;
        for (T list : list) {
            element = list;
        }
        return element;

    }

    public T pop() {
         T element = null;
         for (T list : list) {
             element = list;
         }
         list.remove(element);
         return element;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }


}
