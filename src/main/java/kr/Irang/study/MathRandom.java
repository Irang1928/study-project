package kr.Irang.study;

public class MathRandom {
    public static void main(String[] args) {

        // [1] : 반복문 --> 랜덤 숫자 생성
        // 랜덤 숫자 생성중 0을 제외하려면? --> 결과로 나오는 숫자에 1을 더해준다.
        for(int i = 0;i < 10;i++) {
            System.out.print((int)(Math.random() * 10 + 1) + " ");
        }
        System.out.println();

    }
}
