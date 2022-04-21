package kr.Irang.study;

public class MinAlgorithm {
    public static void main(String[] args) {

        // [1] : 배열 선언
        int[] ar = {4, 13, 150, 17, -2};

        // [2] : max, min 함수
        System.out.println(Math.max(10, 4));    // 10
        System.out.println(Math.min(10, 4));    // 4

        // [3] : 일단 배열내 첫번째 원소의 값이 제일 작다고 가정하고 초기화
        // int min = Integer.MAX_VALUE;
        int min = ar[0];

        // [4] : 반복문을 돌면서 비교하여 출력 --> 이때, 비교는 2번째부터 비교하면 되니까 int = 1로 시작.
        System.out.println("현재 배열내 가장 작은 값은 : " + min);

        for(int i = 1;i<ar.length;i++)
            if(min>ar[i])
                min = ar[i];
        System.out.println("현재 배열내 가장 작은 값은 : " + min);

    }
}
