package kr.Irang.study;

class Person {

    // [1] : 속성(Attribute)
    int age;        // 나이
    String name;    // 이름


    // [2] : 생성자(Constructor)
    Person() {}
    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // [3] : 메서드(Method)
    void printPerson() {
        System.out.println("나이 : " + age + ", 이름 : " + name);
    }

}

public class Class_7 {
    public static void main(String[] args) {

        // [1] : 객체 생성
        Person p1 = new Person(20, "홍길동");
        // System.out.println(p1);         // 주소
        // System.out.println(p1.age);     // 20
        // System.out.println(p1.name);    // 홍길동
        p1.printPerson();

        Person p2 = new Person(30, "이순신");
        p2.printPerson();

        Person p3 = new Person(40, "을지문덕");
        p3.printPerson();

    }
}
