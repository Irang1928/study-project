package kr.Irang.study;

public class CosPattern6_Practice {
    public static void main(String[] args) {

        // 유동적으로 배열의 크기가 변할때마다 바뀔 수 있게 짜려면 어떻게 해야할까?

        char[][] ar = new char[][] {
                {'□', '□', '□', '□', '□', '□'},
                {'□', '□', '□', '□', '□'},
                {'□', '□', '★', '□', '□', '□', '□'},
                {'□', '□', '□', '□', '□'},
                {'□', '□', '□', '□', '□', '□', '□', '□'}
        };
        System.out.println("-----------------------");
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++)
                System.out.print(ar[i][j] + " ");
            System.out.println();
        }
        System.out.println("-----------------------");
    }
}
