package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelloWorld {
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
        List<Integer> l = null;
        try {
            HelloWorld h = new HelloWorld();
            h.setName("cxw");
            h.setAge(10);
            System.out.println(h.toString());
            l = new ArrayList<Integer>();
            System.out.println(h);
            System.out.println("args = " + Arrays.deepToString(args));
            System.out.println("HelloWorld.main");
            System.out.println("l = " + l);
            ArrayList<String> strings = new ArrayList<String>();
            if (strings != null && !"".equals(strings)) {

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }

        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add("234");
        for (Object o : arrayList) {
            System.out.println(o);
        }

        if (l == null) {
            if (l != null) {
                for (Integer integer : l) {
                    for (Integer integer1 : l) {

                    }
                }
            }
        }


    }
}
