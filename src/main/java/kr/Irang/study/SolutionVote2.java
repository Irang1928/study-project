package kr.Irang.study;

import java.util.Arrays;

public class SolutionVote2 {
    public static void main(String[] args) {

        // [1] : 정수형 배열 선언
        int[] vote_vox = {4, 7, 5, 9, 3, 6, 8};

        // [2] : 오름차순으로 정렬
        Arrays.sort(vote_vox);

        // [3] : 출력
        System.out.println(Arrays.toString(vote_vox));

        // [4] : 최솟값, 최댓값
        System.out.println("최솟값 = " + vote_vox[0]);                      // 3
        System.out.println("최댓값 = " + vote_vox[vote_vox.length - 1]);    // 9

    }
}
