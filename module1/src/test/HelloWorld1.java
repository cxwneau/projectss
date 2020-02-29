package test;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld1 {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        HelloWorld1 h = new HelloWorld1();
        h.setName("cxw");
        h.setAge(10);
        System.out.println(h.toString());
        List l = new ArrayList<Integer>();

        HelloWorld h1 = new HelloWorld();
        h.setName("new");


    }

}
