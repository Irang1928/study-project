package kr.Irang.study;

// [1] : 상속(Inheritance)이란?
// 말 그대로 부모 클래스가 가지고 있는 속성(변수)들과 동작/기능(메서드)들을 그대로 물려받아 새로운 클래스를 만드는 것.
// 상속을 활용하면 물려받은 것들은 그대로 쓰면 되고, 거기에 덧붙여 새로운 것만 만들면 되므로 그만큼 노력과 시간이 세이브됨.
// 이때, 물려받게 되는 원본 클래스를 부모 클래스(Parent class) 또는 슈퍼 클래스(Super class)라고 부른다.
// 상속받아 새롭게 만들어진 클래스는 말 그대로 자식 클래스(Child class) 또는 서브/하위 클래스(Sub class)라고 부른다.
// 또 다른 표현으로는 기초/기반 클래스(Base class), 파생 클래스(Derived class)라고도 부른다. --> derived : (a)유래된, 파생된

// [2] : 상속의 장점
// 가장 큰 장점 --> 재활용성~!!
// 완전히 새로운 것을 만드는 것이 아니라 기존 부모로부터 상속을 받아 필요한 것만 추가로 더해서 만드는 것.
// 부모 클래스에 정의되어져 있는 멤버 필드(변수)나 메서드들을 그대로 상속받아 사용하면 된다.
// 상속받은 메서드라 해도 필요에 따라서 자식 클래스에서 용도를 변경해서 사용하는 것도 가능.

// [3] : 상속의 사용
// 기존 부모 클래스를 확장한다는 개념 --> extends 키워드 사용.
// 부모 클래스의 멤버 필드, 메서드는 상속이 가능하나 생성자는 상속이 안된다.
// 부모 클래스의 접근 제한자 private인 경우에는 아무리 자식 클래스가 상속을 받았다 하더라도 접근 불가능.


class Person2 {
    // Field
    int gender;
    int power;

    // Constructor
    Person2() {
        this.gender = 1;    // 1 : 남성, 2 : 여성
        this.power = 100;   // 기본 파워
    }

    // Method
    void walk() {
        System.out.println("걸어가고 있어요~");
    }
}

class Hero extends Person2 {
    // Field
    String name;
    int age;

    // Constructor
    Hero() {}
    Hero(String name, int age) {
        super();    // 부모 클래스의 생성자를 호출. (생략가능)
        this.name = name;
        this.age = age;
    }

    // Method
    void walk() {
        System.out.println("2배로 빨리 걸어가고 있어요~");
    }

    void eat() {
        System.out.println("밥먹고 있어요~");
    }

    void displayPerson() {
        System.out.println("이름 : " + name + ", 나이 : " + age + ", 성별 : " + gender + ", 파워 : " + power);
    }
}

class Villain {}


public class Class_8 {
    public static void main(String[] args) {

        // [1] : 객체 생성
        Person2 p1 = new Person2();
        p1.walk();
        // p1.eat();    // Err

        // [2] : 상속을 통한 슈퍼맨 객체 생성
        Hero h1 = new Hero("슈퍼맨", 20);
        System.out.println(h1.name);
        System.out.println(h1.age);
        System.out.println(h1.gender);  // 부모 클래스 필드(변수)
        System.out.println(h1.power);   // 부모 클래스 필드(변수)
        h1.walk();                      // 메서드 오버라이딩
        h1.eat();
        h1.displayPerson();

        // [3] : 원더우먼 객체 생성
        Hero h2 = new Hero("원더우먼", 30);
        h2.displayPerson();
        h2.gender = 2;
        h2.power = 300;
        h2.displayPerson();
        h2.walk();

    }
}
