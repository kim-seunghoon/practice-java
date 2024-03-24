package chapter_05;

public class _03_multiArray {
    public static void main(String[] args) {
        //다차원 배열(2차원)

        String[] seatA = {"a1", "a2", "a3", "a4", "a5"};
        String[] seatB = {"b1", "b2", "b3", "b4", "b5"};
        String[] seatC = {"c1", "c2", "c3", "c4", "c5"};
        //배열이 많아지면 힘드니 이 걸 한 줄로 표현한다면?
        String[][] seats = new String[][] {
                {"a1", "a2", "a3"},
                {"b1", "b2", "b3", "b4"},
                {"c1", "c2", "c3", "c4", "c5"},
        };

        //b2에 접근한다면?
        System.out.println(seats[1][1]);
    }
}
