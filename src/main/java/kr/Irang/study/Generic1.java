package kr.Irang.study;

class Sample {
    // Field
    private Object obj;

    // Constructor
    Sample(Object x) {
        this.obj = x;
    }

    // Method
    public Object getObj() {
        return obj;
    }

    void printInfo() {
        System.out.println(obj.getClass().getName());
    }
}

public class Generic1 {
    public static void main(String[] args) {

        // [1] : 객체 생성 --> 문자열
        Sample s1 = new Sample("안녕하세요~");
        System.out.println(s1.getObj());
        s1.printInfo();
        System.out.println("---------------------");

        // [2] : 객체 생성 --> 숫자
        Sample s2 = new Sample(100);
        System.out.println(s2.getObj());
        s2.printInfo();
        System.out.println("---------------------");

        // [3] : 객체 생성 --> Object
        Sample s3 = new Sample(new Object());
        System.out.println(s3.getObj());
        s3.printInfo();
        System.out.println("---------------------");

        // [4] : 위와 같이 사용시 --> 단점
        // s1 --> 문자열
        // Object str = s1.getObj();                // 리턴시 반환 타입이 Object 이다.
        // System.out.println(str.length());        // Err
        String str = (String)s1.getObj();           // 형변환
        System.out.println(str.length());           // 6

        // s2 --> 숫자
        // Object num = s2.getObj();
        // System.out.println(num + 100);           // Err
        int num = (int)s2.getObj();                 // 형변환
        System.out.println(num + 100);              // 200

    }
}
