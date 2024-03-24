package practice_list;

public class staticKeyword {
    public static void main(String[] args) {
        //공유의 의미를 담는 키워드
        //사용
        //static 필드 - 클래스 변수 ex) static int count = 0;
            //객체 밖에 있는 영역에서 공유할 수 있는 변수
        //static 메소드 - 유틸리티 메소드

        student a = new student("Tom");
        System.out.println(a.count);
        student b = new student("John");
        System.out.println(b.count);
        student c = new student("Kate");
        System.out.println(c.count);
    }
}
class student {
    static int count = 0;//class 변수가 되고, 객체 밖에서 공유하는 변수
    //int count = 0; a, b, c 객체가 개별적으로 갖고 있는 변수였다
    String name;//인스턴스 변수 = 객체 내부의 변수

    //객체를 생성하는 생성자가 호출 될 때마다 카운트 증가
    student(String name) {
        count++;
        this.name = name;
    }
}
