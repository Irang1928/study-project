package kr.Irang.study;

class Person9 {}
class Batman extends Person9 {}

class Human {}
class Superman extends Human {}

public class Polymorphism5 {
    public static void main(String[] args) {

        // [1] : 배열에서 다형성을 사용할 수 없다면..
        // 배열 --> 동일한 타입의 데이터를 하나로 묶어서 관리하는 자료구조 --> 다형성이 없다면 각 객체별로 관리를 해야 한다.
        Person9[] persons = new Person9[10];    // --- 이건 Person 전용 --;;
        persons[0] = new Person9();
        persons[1] = new Person9();
        persons[2] = new Batman();

        Batman[] batmans = new Batman[10];      // --- 이건 Batman 전용 --;;
        batmans[0] = new Batman();
        batmans[1] = new Batman();
        // batmans[2] = new Person9();          // --- Err

        // [2] : 배열에서 다형성을 사용할 수 있기에..
        Human[] humans = new Human[10];
        humans[0] = new Human();
        humans[1] = new Superman();

        // [3] : 매개변수의 다형성
        // 프로그래밍 언어에서 함수나 메서드를 호출할 때는 그에 맞는 적절한 파라미터를 보내줘야 한다.
        // System.out.println() 메서드의 경우 어떤 타입, 객체를 매개변수로 받더라도 에러없이 해당 객체의 값을 출력
        // 그것이 가능한 이유 --> 바로 다형성을 활용하고 있기 때문이다.
        // 실제 메서드의 API를 보면 --> public void println(Object x) 로 되어 있기에 어떤 객체 타입이 전달되더라도 에러없이 출력이 되는 것이다.
        // 결론적으로, Object는 가장 최상위(단군 할아버지, 창조주)이므로 어떤 객체를 보내도 그보다 상위 타입이 된다.
        System.out.println(new Person9());
        System.out.println(new Batman());
        System.out.println(new Human());
        System.out.println(new Superman());

    }
}
