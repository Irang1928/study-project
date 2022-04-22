package kr.Irang.study;

public class CosPattern3 {
    public static void main(String[] args) {

        // [1] : 이중 반복문
        for(int i=0;i<4;i++){
            for(int j=0;j<10;j++){

                // 출력값
                int output = i * 10 + j;

                // 짝수만 출력
                if(output % 2 != 0)
                    continue;
                else
                    System.out.print(output + " ");
            }
            System.out.println();
        }

    }
}
