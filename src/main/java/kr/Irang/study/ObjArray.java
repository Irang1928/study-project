package kr.Irang.study;

class Person4 {
    // Field
    private String name;
    private int age;

    // Constructor
    Person4() {}
    Person4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

}

public class ObjArray {
    public static void main(String[] args) {

        // [1] : 객체 생성
        int[] ar1 = {1, 2, 3, 4, 5};
        char[] ar2 = {'a', 'b', 'c', 'd', 'e'};
        Person4[] pa = new Person4[5];
        pa[0] = new Person4("홍길동", 20);
        pa[1] = new Person4("박길동", 21);
        pa[2] = new Person4("김길동", 22);
        pa[3] = new Person4("장길동", 23);
        pa[4] = new Person4("고길동", 24);

        // [2] : 출력
        for(int i=0;i<ar1.length;i++) {
            System.out.print(pa[i].getName() + " ");
        }
        System.out.println();

    }
}
