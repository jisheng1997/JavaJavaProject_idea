package oop.Student;

public class Student {
    private int number;
    private int state;
    private int score;

    public Student(int number,int state,int score){
        this.number = number;
        this.state = state;
        this.score = score;
    }

    public String toString(){
        return "学号：" + number + "  年级：" + state + "  分数：" + score;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
