package chapter_05;

public class _02_arrayLoop {
    public static void main(String[] args) {
        String[] coffees = {"Americano", "Cappuccino", "Latte", "OrangeJuice"};

        //배열의 길이를 이용한 순회
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 한 잔");
        }

        //enhanced for(for - each) 반복문
        for (String coffee : coffees) {
            System.out.println(coffee + "한 잔");
        }

    }
}
