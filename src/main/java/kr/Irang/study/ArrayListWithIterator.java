package kr.Irang.study;

// [!] : Iterator(반복자)란 무엇인가?
// 사전적의미 --> "반복자"라는 의미에서 어느정도 유추할 수 있듯이 Collection 에 대한 '반복자' 이다.
// 컬렉션 프레임워크내에는 다양한 컬렉션들이 있는데 요소(=원소)를 읽어올 때 Iterator 인터페이스로 표준화하고 있다.
// 보통 for 반복문을 사용하여 순회할 때 --> index 로 각 요소를 순회하나 --> Iterator(반복자)를 이용하면 조금 더 편리하게 할 수 있다.
// Iterator(반복자)는 인터페이스다 --> 그래서, 인터페이스내 선언된 메서드들이 있다. --> 주요 메서드 암기!

// hasNext(), next(), remove() --> 반환타입은 --> boolean, Object(제네릭), void
// hasNext()            --> 다음 요소가 있는 지를 검사하여 true 를 리턴.
// next()               --> 다음 요소를 리턴 --> 그런 후 다음 위치로 커서가 이동 --> Iterator 에서는 삭제하지 않고, 커서만 이동.
// remove()             --> 제거

// next() 메서드의 경우   --> 배열에 값이 없을 때 사용하면 --> 당연히 오류 발생(주의)
// 따라서, 사전에 hasNext() 메서드를 사용하여 --> 다음 요소가 있는 지 확인 후 --> next() 메서드로 안전하게 요소를 가져온다.
// 임포트 필요 --> import java.util.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListWithIterator {
    public static void main(String[] args) {

        // [1] : 객체 생성
        ArrayList<String> list = new ArrayList<>();

        // [2] : 요소 추가 --> add()
        list.add("Alligator");
        list.add("Hippo");
        list.add("Ostrich");
        list.add("Donkey");

        // [3] : Iterator(반복자) 객체 생성 --> 객체 생성 과정도 중요!
        // Collection 인터페이스 --> iterator() 메서드를 정의하고 있고 --> 이를 상속받는게 List, Set 인터페이스이므로,
        // List, Set 인터페이스를 상속받아 구현한 클래스들 객체를 통해서 iterator() 메서드를 사용할 수 있음.
        Iterator<String> iter = list.iterator();

        // [4] : Iterator(반복자) 메서드 사용 --> hasNext(), next(), remove()
        // System.out.println(iter.hasNext());     // true --> 왜? --> 첫 번째 요소인 악어가 있어서.
        // System.out.println(iter.next());        // Alligator
        // System.out.println(iter.hasNext());     // true --> 왜? --> 두 번째 요소인 하마가 있어서.
        // System.out.println(iter.next());        // Hippo
        // System.out.println(iter.hasNext());     // true --> 왜? --> 세 번째 요소인 타조가 있어서.
        // System.out.println(iter.next());        // Ostrich
        // System.out.println(iter.hasNext());     // true --> 왜? --> 네 번째 요소인 당나귀가 있어서.
        // System.out.println(iter.next());        // Donkey
        // System.out.println(iter.hasNext());     // false
        // System.out.println(iter.next());        // Err

        // [5] : 요소 출력 --> 향상된 for 문
        for(String s : list)
            System.out.println(s);

        // [6] : 요소 출력 --> while 반복문 사용
        // (문제 속의 문제 1) --> 배열 요소 전체를 출력해보시오.
        // (문제 속의 문제 2) --> 아래의 출력 결과를 예상하여 말해보시오.
        // (문제 속의 문제 3) --> Hippo 요소만 출력해보시오.
        // (문제 속의 문제 4) --> Hippo 요소만 삭제해보시오.
        System.out.println("---------------------------[Iterator(반복자)로 출력]");
        while(iter.hasNext()) {
            String str = iter.next();
            if("Hippo".equals(str)) {
                iter.remove();
                System.out.println("하마 삭제");
            }
            // System.out.println(iter.next());
        }
        System.out.println("---------------------------[Iterator(반복자)로 출력]");

        for(String s : list)
            System.out.println(s);

    }
}
