package mianshi;

import org.junit.Test;

import java.util.HashSet;
import java.util.Objects;

/**
 * @ClassName : HashSetMst1
 * @Description :
 * @Author : MrKino
 * @Date : 2020/9/3 22:29
 * @Version : 1.0
 **/
public class HashSetMst1 {
    @Test
    public void test1(){
        HashSet set = new HashSet();
        Person p1 = new Person(1001,"AA");
        Person p2 = new Person(1002,"BB");

        set.add(p1);
        set.add(p2);

        System.out.println(set);//结果为：[Person{id=1002, name='BB'}, Person{id=1001, name='AA'}]

        p1.name = "CC";
        set.remove(p1);
        System.out.println(set);//结果为：[Person{id=1002, name='BB'}, Person{id=1001, name='CC'}]

        set.add(new Person(1001,"CC"));
        System.out.println(set);//结果为：[Person{id=1002, name='BB'}, Person{id=1001, name='CC'}, Person{id=1001, name='CC'}]

        set.add(new Person(1001,"AA"));
        System.out.println(set);//结果为：[Person{id=1002, name='BB'}, Person{id=1001, name='CC'}, Person{id=1001, name='CC'}, Person{id=1001, name='AA'}]
    }




}

class Person{
    int id;
    String name;

    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
