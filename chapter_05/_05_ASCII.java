package chapter_05;

public class _05_ASCII {
    public static void main(String[] args) {
        //ANSI : 미국 표준 코드

        char c = 'A';
        System.out.println(c);
        System.out.println((int)c);

        c = 'B';
        System.out.println(c);
        System.out.println((int)c);

        c ++;
        System.out.println(c);
        System.out.println((int)c);

        //배열을 더 쉽고 간편하게
        String[][] seats3 = new String[10][15];
        char ch = 'A';
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(ch) + (j + 1);
                System.out.print(seats3[i][j] + "\t");
            }
            ch++;
            System.out.println();
        }
//        for (int i = 0; i < seats3.length; i++) {
//            for (int j = 0; j < seats3[i].length; j++) {
//                System.out.print(seats3[i][j] + "\t");
//            }
//            System.out.println();
//        }
    }
}
