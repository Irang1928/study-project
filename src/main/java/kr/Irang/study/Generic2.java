package kr.Irang.study;

class PersonG {
    // Field
    public Object obj;

    // Constructor
    PersonG(Object obj) {
        this.obj = obj;
    }
}

class StudentG {
    // Field
    public int grade;

    // Constructor
    StudentG(int grade) {
        this.grade = grade;
    }
}

class Teacher {}

public class Generic2 {
    public static void main(String[] args) {

        // [1] : 객체 생성
        PersonG p1 = new PersonG(new StudentG(1));
        // System.out.println(p1.obj);

        // [2] : 형변환 --> Cast
        Teacher t1 = (Teacher)p1.obj; // 이 부분은 컴파일 단계에서는 에러가 안나고, 실행하는 단계에서 ClassCast 오류가 발생한다.

    }
}
