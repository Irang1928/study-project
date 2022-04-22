package kr.Irang.study;

public class CosPattern4 {
    public static void main(String[] args) {

        // [1] : 이중 반복문
        outerloop:
        for(int i=0;i<4;i++){
            for(int j=0;j<10;j++){

                // 출력값
                int output = i * 10 + j;

                // 짝수만 출력
                if(output % 2 != 0) {
                    // j가 1이면 outerloop label이 선언된 바깥쪽 for문으로 분기하여 그 다음 단계부터 다시 수행.
                    if (j == 1) {
                        System.out.println();
                        continue outerloop;
                    }
                    continue;
                }
                else
                    System.out.print(output + " ");
            }
            System.out.println();
        }
    }
}
