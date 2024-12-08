package ch11_1203_3;

public class Student { // = extends Object 오브젝트는 모든 클래스의 부모 클래스
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return name;

    }

}

