package chapter_06;

public class _07_variableScope {

    public static void method_a(){//만든 변수를 전달값으로 쓰고 싶으면(int number) 입력
        //System.out.println(number);
        //System.out.println(result);
    }

    public static void method_b(){
        int result = 1; //지역변수
    }

    public static void main(String[] args) {
        //메인 영역 내에서 선언된 변수는 메소드에서 가져다 쓸 수 없다
        int number = 3;

        //System.out.println(result);
    }
}
