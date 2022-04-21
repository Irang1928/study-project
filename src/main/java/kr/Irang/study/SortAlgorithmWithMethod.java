package kr.Irang.study;

import java.util.Arrays;

public class SortAlgorithmWithMethod {
    public static void main(String[] args) {

        // [1] : 배열 선언 --> 성적 배열
        int[] scores = {88, 55, 39, 100, 90, 100, 98, 67};

        // [2] : 성적 배열 --> 오름차순 정렬 --> Arrays.sort(배열명); --> 오름차순이 기본정렬 --> import 필요.
        // 클래스 메서드로써 Arrays 클래스의 인스턴스 생성없이 바로 사용 가능.
        System.out.print("화장실(정렬) 들어가기 전 = ");
        for(int i = 0;i<scores.length;i++)
            System.out.print(scores[i] + " ");
        System.out.println();

        Arrays.sort(scores);

        System.out.print("화장실(정렬) 들어가기 후 = ");
        for(int i = 0;i<scores.length;i++)
            System.out.print(scores[i] + " ");
        System.out.println();

        // [3] : 향상된 for문 사용
        System.out.print("화장실(정렬) 들어가기 후 = ");
        for(int i : scores)
            // System.out.print(scores[i]);    // Err
            System.out.print(i + " ");
        System.out.println();

    }
}
