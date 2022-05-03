package kr.Irang.study;

// [!] : ArrayList
// 먼저, 자바의 배열은 크기를 미리 지정하고 사용했다. --> 그러다보니 넉넉하게 크기를 지정해놓고 사용하곤 한다.
// 반면, ArrayList 는 필요 시 언제든지 추가, 삭제가 가능하다.
// List 인터페이스를 상속하므로 인덱스가 있고, 저장 순서가 유지되고, 데이터 중복이 가능하다.
// 또한, 제네릭 문법을 사용할 수 있다. --> 만약, 제네릭을 사용하지 않는다면 내부적으로 Object 타입으로 처리된다.
// 사용으르 위해서는 상단에 임포트가 필요하다. --> import java.util.ArrayList; 또는 import java.util.*;

import java.util.ArrayList;

class PersonA {}

public class ArrayList1 {
    public static void main(String[] args) {

        // [1] : ArrayList 를 제네릭이 아닌 Object 타입으로 사용하는 경우.
        ArrayList list1 = new ArrayList();

        // [2] : 데이터 추가하기 --> add()
        list1.add("홍길동");           // 문자열 자료형 저장
        list1.add(20);                // 정수 자료형 저장
        list1.add("이순신");
        list1.add(20);                // 데이터 중복이 가능
        list1.add(new PersonA());

        // [3] : 데이터 가져오기 --> get() --> 이때, 해당 데이터 자료형으로 형변환하여 사용한다.
        // System.out.println(list1.get(0));    // 홍길동
        String str = (String)list1.get(0);
        System.out.println(str.length());       // 3

        int num = (int)list1.get(1);
        System.out.println(num + 100);          // 120

        // [!] : 결론
        // 이상으로 봤을 때, 제네릭 문법을 사용하지 않으면 ArrayList 는 내부적으로 Object 타입으로 처리됨을 알 수 있다.
        // 이렇게 get() 메서드를 사용할 때는 형변환을 주의해야 한다.
        // 제네릭을 사용하면 된다.


        // [4] : 출력 --> 반복문 --> 배열의 크기(size) --> 객체명.size()
        System.out.println(list1.size());       // 5
        for(int i=0;i<list1.size();i++)
            System.out.println(list1.get(i) + " ");

    }
}
