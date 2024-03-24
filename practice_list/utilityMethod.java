package practice_list;

public class utilityMethod {
    public static void main(String[] args) {
        Test.m1();//유틸리티 메소드는 출력가능
//        Test.m2();
//        Test test = new Test();
//        test.m1();
//        test.m2();
        Test test = new Test();
        test.m2();
        //일반적으로 유틸리티 메소드는 객체를 만들고 호출하지 않음(가독성)
    }
}
class Test {
    //유틸리티 메소드
    static void m1() {
        System.out.println("유틸리티 메소드 호출");
    }
    //일반 메소드
    void m2() {
        System.out.println("일반 메소드 호출");
    }
}
