package kr.Irang.study;

abstract class Car1 {
    abstract void run();
}

class Ambulance1 extends Car1 {
    void run() {System.out.println("앰블런스 지나가요~ 삐뽀삐뽀~");}
}

class Cultivator1 extends Car1 {
    void run() {System.out.println("경운기 지나가요~ 덜컹덜컹~");}
}

class SportsCar1 extends Car1 {
    void run() {System.out.println("스포츠카 지나가요~ 씽~");}
}

public class Polymorphism4 {
    public static void main(String[] args) {

        // [1] : 배열 길이가 3인 Car 객체 배열 선언
        // Car1[] cars = new Car1[3];
        // System.out.println(cars[0]);    // null --> 각 배열에는 아직 null 값만 존재.
        // cars = new Car1[] {new Ambulance1(), new Cultivator1(), new SportsCar1()};  // cars 배열 초기화

        // [2] : 1번 방법 말고 --> 자식 클래스로 객체 생성 --> 타입은 부모 타입으로 --> 이렇게 생성된 객체들로 바로 배열 초기화 --> 다형성 덕분.
        Car1[] cars = {new Ambulance1(), new Cultivator1(), new SportsCar1()};

        // [3] : 반복문 돌면서 각 객체의 run() 메서드 호출
        for(int i=0;i<cars.length;i++) {
            System.out.println(cars[i]);    // 각 객체가 생성된 메모리 공간의 주소 값을 출력.
            cars[i].run();
        }

        // [4] 향상된 for문
        System.out.println("---------------------------------");
        for(Car1 obj : cars) {
            obj.run();
        }

    }
}
