package kr.Irang.study;

public class CosPattern1 {
    public static void main(String[] args) {

        // [1] : 배열 선언
        int[] target = {1, 3, 3, 2, 1, 1, 3, 0, 1, 2};

        // [2] : 배열내 각 숫자들의 빈도 수 출력하기
        // 1 --> 빈 정수형 배열(ar)을 하나 만들어놓고 초깃값은 모두 0으로 셋팅한다.
        // 2 --> target 배열내 숫자가 빈 배열(ar)의 인덱스로 적용되서 해당 인덱스의 ar배열 요소의 값을 1씩 증가시킨다.
        // 3 --> 이때, 빈 배열(ar)의 요소 갯수는 target 배열내 숫자들의 종류만큼 지정한다.
        int[] ar = new int[4];

        for(int i=0;i<target.length;i++)
            ar[target[i]]++;

        // [3] : 출력
        for(int i=0;i<ar.length;i++)
            System.out.println(i + "번 숫자 --> " + ar[i] + "회");

    }
}
