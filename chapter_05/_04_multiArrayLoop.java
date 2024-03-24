package chapter_05;

public class _04_multiArrayLoop {
    public static void main(String[] args) {
        String[][] seats = {
                {"A1","A2", "A3", "A4", "A5"},
                {"B1","B2", "B3", "B4", "B5"},
                {"C1","C2", "C3", "C4", "C5"},
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------");

        String[][] seats2 = {
                {"A1","A2", "A3"},
                {"B1","B2", "B3", "B4"},
                {"C1","C2", "C3", "C4", "C5"},
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < seats2[i].length; j++) {
                System.out.print(seats2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------");

        //다차원 배열에 있어 제일 중요하다고 생각하는 부분!!!
        String[][] seats3 = new String[10][15];
        String[] eng = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = eng[i] + (j + 1);
                System.out.print(seats3[i][j] + "\t");
            }
            System.out.println();
        }

//        seats3[7][8] = "xx";
//        seats3[6][9] = "xx";
//        for (int i = 0; i < seats3.length; i++) {
//            for (int j = 0; j < seats3[i].length; j++) {
//                System.out.print(seats3[i][j] + "\t");
//            }
//            System.out.println();
//        }
    }
}
