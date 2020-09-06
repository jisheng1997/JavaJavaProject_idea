package test;

public class Test {
    public static void main(String[]args){
        Student student = new Student("张三",24);
        student.read();
    }
}

class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void read(){
        System.out.println(name + "在读书");
    }
}
