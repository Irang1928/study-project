package kr.Irang.study;

public class MaxMin {
    public static void main(String[] args) {

        // [1] : 정수 배열 선언
        int[] ar = new int[10];

        // [2] : 반복문을 돌면서 랜덤으로 10개 정수 값을 셋팅 --> Math.random()
        for(int i = 0;i<ar.length;i++) {
            ar[i] = (int)(Math.random() * 10);
            System.out.print(ar[i] + " ");
            // System.out.println((int)(Math.random() * 10));
        }
        System.out.println();

        // [3] : 최댓값, 최솟값 변수 --> 변수 초기화
        int max = ar[0], min = ar[0];

        // [4] : 반복문을 돌면서 최댓값, 최솟값 비교
        for(int i = 1;i<ar.length;i++) {
            if(max < ar[i])
                max = ar[i];
            if(min > ar[i])
                min = ar[i];
        }

        // [5] : 출력
        System.out.println("----------------------------------------");
        System.out.println("ar 배열내 최댓값 : " + max);
        System.out.println("ar 배열내 최솟값 : " + min);
        System.out.println("----------------------------------------");

    }
}
