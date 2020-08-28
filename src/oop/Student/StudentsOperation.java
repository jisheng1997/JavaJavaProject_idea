package oop.Student;

import java.util.ArrayList;


class StudentsOperation {
    private ArrayList<Student> students = new ArrayList<Student>();
    public StudentsOperation(ArrayList<Student> students){
        this.students = students;
    }

    //遍历学生数组
    public void printStudents() {
        for(Student student:students){
            System.out.println(student.toString());
        }
    }

    //输出n年级的student信息
    public void printStudentsOfState(int state){
        for(Student student:students){
            if(student.getState() == state){
                System.out.println(student.toString());
            }
        }
    }

    //使用冒泡排序按学生成绩降序排列
    public void sortStudentByScore(){
        for (int i = 0;i<students.size();i++){
            for (int j = 0;j<students.size()-i-1;j++){
                if (students.get(j).getScore()<students.get(j+1).getScore()){
                    Student temp = students.get(j);
                    students.remove(j);
                    students.add(j+1,temp);
                }
            }
        }
    }


}