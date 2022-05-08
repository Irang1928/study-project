package kr.Irang.study;

// [!] : 컬렉션 프레임워크를 쓸 때 한번 이상은 꼭 만나게 되는 에러 메세지 --> java.util.ConcurrentModificationException
// 이 오류 메세지는 보통 컬렉션 list 요소를 반복문 안에서 돌리면서 값을 삭제하고자 할 때 발생.
// 보통 반복문 안에서 remove() 메서드를 호출 할 때 발생.
// 그 외에도, iterator(반복자) 객체의 생성 순서에 따라서도 발생 --> 아무튼 다양하다.

// 한 행씩 삭제하는 경우에는 별 문제가 없으나 --> 반복문 안에서 순회하면서 삭제시에는..
// 반복문 들어가기 전의 기존 list 배열의 size(length)나 index 정보 등이 변경되면서 --> 순회 시 정보가 맞지 않아 오류가 발생
// 이를 해결하기 위해서는 --> Iterator(반복자)를 사용하여 순회하고 --> 그때, iter.remove() 메서드로 처리해야 한다.

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListWithIteratorWhyUse {
    public static void main(String[] args) {

        // [1] : 객체 생성
        ArrayList<Integer> list = new ArrayList<>();

        // [2] : 요소 추가 --> add
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // [3] : Iterator(반복자) 객체 생성
        Iterator<Integer> iter = list.iterator();

        // [4] : 출력 --> 요소 삭제 전
        for(Integer num : list)
            System.out.print(num + " ");
        System.out.println();

        // [5-1] : 요소 삭제 --> 반복문 없이 한 개의 요소만 삭제
        // System.out.println(list.get(1));    // 2
        // list.remove(1);                     // 2번 삭제
        // System.out.println(list.get(1));    // 3

        // [5-2] : 요소 삭제 --> while 반복문 사용
        System.out.println("----------------------------");

        while(iter.hasNext()) {
            Integer i = iter.next();
            if(i == 2) {
                iter.remove();
                System.out.println(i + "번 삭제");
            }
        }

        System.out.println("----------------------------");

        // [6] : 출력 --> 요소 삭제 후
        for(Integer num : list)
            System.out.print(num + " ");
        System.out.println();

    }
}
