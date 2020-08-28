package oop.Student;

import java.util.ArrayList;

/*
* 4. 对象数组题目：
定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩
score(int)。 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
问题一：打印出3年级(state值为3）的学生信息。
问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
提示：
1) 生成随机数：Math.random()，返回值类型double;
2) 四舍五入取整：Math.round(double d)，返回值类型long。
练习3
5.声明一个日期类型MyDate：有属性：年year,月month，日day。创建2个日期
对象，分别赋值为：你的出生日期，你对象的出生日期，并显示信息。
*/
public class StudentTest {
    public static void main(String[]args){
        //创建student对象数组并赋值
        ArrayList<Student> students = new ArrayList<Student>();
        for (int i = 0;i<20;i++){
            Student student = new Student(i+1,(int)(Math.random()*6+1),(int)(Math.random()*101));
            students.add(student);
        }
        //实例化Studentoperation
        StudentsOperation studentsOperation = new StudentsOperation(students);

        //遍历并输出student对象数组
        studentsOperation.printStudents();
        System.out.println("***************************************");

        //输出3年级的student信息
        studentsOperation.printStudentsOfState(3);
        System.out.println("***************************************");

        //使用冒泡排序按学生成绩降序排列
        studentsOperation.sortStudentByScore();
        studentsOperation.printStudents();
        System.out.println("***************************************");
    }

}

