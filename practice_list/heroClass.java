package practice_list;

public class heroClass {
    public static void main(String[] args) {
        hero h1 = new hero();
        h1.name = "관우";
        h1.hp = 100;
        h1.attack();

        hero h2 = new hero("장비", 150);
        h2.attack();
    }
}

class hero {
    String name;
    int hp;

    //생성자
    //특징1 : 리턴 타입 명시가 없는 메소드
    //특징2 : 이름이 클래스 명과 같음
    hero(){}
    hero(String _name, int _hp) {
        name = _name;
        hp = _hp;
    }

    void attack() {
        System.out.println(name + "이(가) 펀치를 날립니다. 남은" +
                "체력 : " + hp);
    }
}
