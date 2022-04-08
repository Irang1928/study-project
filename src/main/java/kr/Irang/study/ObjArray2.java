package kr.Irang.study;

class Person5 {
    // Field
    private String name;
    private int age;

    // Constructor
    Person5() {}
    Person5(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

}

public class ObjArray2 {
    public static void main(String[] args) {

        // [1] : 객체 생성
        Person5[] pa;          // Person 타입의 객체 배열 변수 pa 선언
        pa = new Person5[5];   // Person 객체의 참조값을 원소로 가지는 배열 공간을 5개 생성 --> 5명 객체 생성할테니 주소 저장해라.

        // [2] : 반복문(for)을 돌면서 Person() 객체 생성
        for(int i=0;i<pa.length;i++) {
            pa[i] = new Person5(i + 1 + "번 후보자", i + 20);   // i만 입력하면 안되나 문자열을 붙이면 문자열로 전달.

            // [2-1] : getter, setter 메서드를 사용해서 출력
            // System.out.println(pa[i].getName() + " --> 나이 : " + pa[i].getAge());

            // [2-2] : 배열 인덱스를 사용해서 출력 --> 단, 이렇게 쓰려면 private 선언을 삭제하고 써야함.
            // System.out.println(pa[i].name + "의 나이는 " + pa[i].age + "살 입니다.");

            // [2-3] : printf()
            System.out.printf("%s의 나이는 %d살 입니다.%n",pa[i].getName(), pa[i].getAge());
        }

    }
}
