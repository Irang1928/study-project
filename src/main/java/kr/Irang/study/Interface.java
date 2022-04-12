package kr.Irang.study;

// [!] : 인터페이스란 무엇인가?
// 사전적 의미 --> 결합부, 접속기 --> 사용자간 또는 컴퓨터간 통신이 가능하도록 해주는 디바이스나 프로그램.
// 큰 틀에서 본다면 자바에서의 인터페이스 개념도 사전적 의미와 비슷하다.
// 상호간 통신을 위해서는 "규격" 중요하다. --> 일본이 110v 가전제품을 한국으로 가지고 와도 "규격"이 맞지 않으므로 사용할 수 없다.
// 일본의 가전기업들이 한국에서 전자제품을 팔고 싶다면 한국내 220v "규격"을 지켜서 만들어야만 팔 수 있다.
// 이러한 "규격"을 인터페이스라 할 수 있고, 인터페이스는 하나의 "표준화"를 제공하는 것이라 할 수 있다.

// 추상 클래스 vs 인터페이스?
// 추상 클래스와 거의 비슷하다. --> 그러나 그 추상화 정도가 더 높다(더 엄격하다). --> 따라서, 일반 메서드 멤버 필드(변수)를 가질 수 없다.
// 이러한 점들이 추상 클래스와 인터페이스간 가장 큰 차이점 중 하나이다. --> 더 있다라는 얘기..

// 자바에서의 인터페이스 문법?
// 표준화 및 규격을 인터페이스로 제공.
// 따라서 어떤 클래스가 해당 인터페이스를 사용(상속)한다면 인터페이스에 선언되어져 있는 메서드를 구현해야 한다.
// 인터페이스는 class 키워드를 사용하지 않고 --> 별도의 interface 키워드를 사용한다.
// class --> extends    interface --> implements
// 추상 클래스와 같이 메서드의 구체적인 내용은 기술되어져 있지 않으므로 인터페이스를 상속받은 클래스에서 재정의(오버라이딩)하여 사용해야 한다.

// 상속 vs 구현
// 클래스와 인터페이스 이 둘의 가장 큰 차이점 중 하나는 "상속"이다.  --> a, b
// 자바에서 클래스는 "단일 상속"만 가능하지만, 인터페이스는 "다중 상속"이 가능하다.
// 그러나 인터페이스는 extends 표현을 쓰지않고 "구현"의 의미를 강조하는 implements 키워드를 사용하여 다중 상속을 구현한다.

//-------------------------------------------------------------------------------------------------------------------

// [1] : 인터페이스
// 추상 클래스와 거의 비슷하나 그 추상화 정도가 더 높다(더 엄격). --> 일반 메서드나 멤버 필드(변수)를 가질 수 없다.
// 표준화 및 규격을 인터페이스로 제공 --> 일종의 "설계도" 개념.
// 따라서, 어떤 클래스가 해당 인터페이스르 사용(상속)한다면 인터페이스에 선언되어져 있는 메서드를 구현.
// 인터페이스는 interface 키워드를 사용.
// 추상 클래스와 같이 메서드의 구체적인 내용은 기술되어져 있지 않으므로 인터페이스를 상속받은 클래스에서 재정의(오버라이딩)하여 사용.

// [2] : 상속
// 클래스는 "단일 상속"만 가능, 인터페이스는 "다중 상속"이 가능 --> 가장 큰 차이점.
// class --> extends,   interface --> implements --> 다중 상속을 구현 --> A, B --> 콤마(,)로 분리
// 즉, 이를 이용하면 여러 개의 인터페이스로부터 메서드를 받아올 수 있게 된다. --> 다중 상속 구현.

// [3] : 장점
// 인터페이스를 이용하면 메서드의 추상적인 "선언"과 그 메서드들을 구체적인 "구현"부분을 분리시킬 수 있다. --> 매우 큰 장점.
// 하청을 주는 대기업(갑)은 하청업체(을)에 인터페이스만 제공 --> 각 하청업체(을)들이 이를 준수하여(=상속 받아) 개발.
// 분업화된 시스템을 구축하여 "갑"과 "을"이 독립적으로 프로젝트 개발을 해나갈 수 있다. --> 매우 큰 장점.

// [4] : 우선 순위 (extends vs implements)
// 상속을 받는 extends 키워드와 구현을 하는 implements 키워드가 동시에 쓰일 때 --> extends 키워드가 항상 먼저 쓰인다.
// 예시) class Student extends Person implements A, B

//------------------------------------------------------------------------------------------------------------------

// Person 클래스(부모)

// A 인터페이스(부모)

// B 인터페이스(부모)

// Student 클래스(자식)

// 메인 클래스(메인 메서드가 포함)

class Person6 {
    // Field
    String name;
    int age;
    int weight;

    // Constructor
    Person6() {}
    Person6(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Method
    void wash() {System.out.println("씻다.");}
    void study() {System.out.println("공부하다.");}
    void play() {System.out.println("놀다.");}
}

interface Allowance {
    // Field
    // 변수는 안되나 상수는 되므로 상수로 지정해주면 됨 --> public static final 을 붙여주면 됨.
    // 인터페이스내 모든 멤버 필드(변수)는 public static final 이여야 함. --> 생략이 가능. --> 그냥 "타입 상수명" 지정해서 쓰면 됨.
    public static final String aaa = "코리아";
    int bbb = 100;

    // Abstract Method
    // 인터페이스내 모든 메서드는 public abstract 이어야 함 --> 생략이 가능.
    public abstract void in(int price, String name);
    abstract void out(int price, String name);
}

interface Train {
    // Abstract Method
    abstract void train(int training_pay, String name);
}

class Student extends Person6 implements Allowance, Train {
    // Field

    // Constructor
    Student() {}
    Student(String name, int age, int weight) {
        super(name, age, weight);
    }

    // Method
    public void in(int price, String name) {System.out.printf("%s에게서 %d원 용돈을 받았습니다.%n", name, price);}
    public void out(int price, String name) {System.out.printf("%d원 금액을 지출했습니다. [지출용도 --> %s]%n", price, name);}
    public void train(int training_pay, String name) {System.out.printf("[%s --> %d원 입금완료]%n", name, training_pay);}
}

public class Interface {
    public static void main(String[] args) {

        // [1] : 객체 생성
        Student s1 = new Student("홍길동", 20, 85);

        // [2] : 클래스와 인터페이스로부터 상속(person)과 구현(Allowance, Train)을 한 메서드들 호출하기
        s1.wash();
        s1.study();
        s1.play();
        s1.in(10000, "엄마");
        s1.out(5000, "편의점");
        s1.train(20000, "훈련비");

        // [3] : 상수 필드 사용하기
        System.out.println(s1.aaa);
        System.out.println(s1.bbb);
        System.out.println(Allowance.aaa);  // static 이므로 객체 생성 필요없음.
        System.out.println(Allowance.bbb);  // static 이므로 객체 생성 필요없음.

    }
}

