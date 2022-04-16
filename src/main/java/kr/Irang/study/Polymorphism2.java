package kr.Irang.study;

class Person8 {
    String str1 = "난 부모 클래스";
    void method1() {System.out.println("에이에이에이");}
    void ppp() {System.out.println("ppp");}
}
class Student8 extends Person8 {
    String str2 = "난 자식 클래스";
    void method1() {System.out.println("오버라이딩 - AAA");}
    void sss() {System.out.println("sss");}
    void x() {
        method1();
        super.method1();
    }
}

public class Polymorphism2 {
    public static void main(String[] args) {

        // [1] : 객체 생성 --> 부모 + 자식 클래스의 모든 자원을 다 쓸 수 있다.
        Student8 s1 = new Student8();
        System.out.println(s1.str1);
        System.out.println(s1.str2);
        s1.method1();                   // 오버라이딩 - AAA
        s1.sss();                       // sss
        s1.ppp();                       // ppp

        // [!] : 그런데 말이죠.. --> 자식 클래스에서 오버라이딩된 부모 클래스의 원본 메서드를 호출하고 싶다면? --> super 사용.
        System.out.println("-----------------------------------------[super 사용]");
        s1.x();
        System.out.println("-----------------------------------------[super 사용]");

        // [2] : 객체 생성 --> 범위는 부모의 자원만을 쓸 수 있다. (?)
        Person8 s2 = new Student8();
        System.out.println(s2.str1);
        // System.out.println(s2.str2); // Err --> 자식의 자원은 쓸 수 없다.
        s2.ppp();                       // ppp
        // s2.sss();                    // Err --> 자식의 자원은 쓸 수 없다.
        s2.method1();                   // 오버라이딩 - AAA --> 오버라이딩한 메서드는 자식의 메서드로 실행.

        // [!] : 그런데 말이죠.. --> 자식의 메서드를 바로 호출하고 싶다면? --> 캐스트 필요.
        System.out.println("-----------------------------------------[캐스트 사용]");
        ((Student8)s2).sss();            // sss
        System.out.println("-----------------------------------------[캐스트 사용]");

        // [3] : 객체 생성
        Person8 aaa = new Person8();
        aaa.method1();                  // 에이에이에이
        // aaa.sss();                   // Err

        // [4] : 객체 생성
        // Student8 bbb = new Person8(); // Err

    }
}
