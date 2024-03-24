package practice_list;

public class callByReference {
    public static void main(String[] args) {
        //primitive
        int money1 = 10000;//money1라는 변수에 직접적으로 10000이 입력
        System.out.print(money1 + " -> ");//10000 -> 출력
        zero(money1);
        System.out.println(money1);//10000출력

        //reference
        Money money2 = new Money(10000);//won:10000객체가 만들어짐
        System.out.print(money2.getWon() + " -> ");//10000 ->
        zero(money2);
        System.out.println(money2.getWon());
    }
    public static void zero(int d) {//int d = money1복사가됨(사본)
        d = 0;//10000을 다시 0으로초기화, d가 0이된 것 money1는 그대로
    }
    //최종적으로 primitive 값은 변경되지 않았지만 reference는 값이 바뀜
    public static void zero(Money m) {//Money m = money 2가 복사가됨
        m.won = 0;//money2를 실행하니 won: 0으로 초기화됨
    }
}
class Money {
    int won;
    Money(int w) {//10000을 전달했기에 w = 10000
        won = w;
    }
    public int getWon() {
        return won;
    }
}
