package chapter_05;

public class _Quiz_05 {
    public static void main(String[] args) {
//        String[] size = {"250", "255", "260", "265", "270", "275",
//        "280", "285", "290", "295"};
        int size = 250;
        for (int i = 0; i < 10; i++) {
            System.out.println("사이즈 " + (size + (i*5)) + " (재고 있음)");
        }

        //강의에 나온 방법
        int[] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (i * 5);
        }

        for (int shoes
                :sizeArray) {
            System.out.println("사이즈 " + shoes + " (재고 있음)");
        }
    }
}
