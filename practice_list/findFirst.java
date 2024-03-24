package practice_list;

public class findFirst {
    //가장 큰 수 찾는 메소드
    public static int topIndex(int scores[]) {
        int topIdx = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[topIdx] < scores[i]) {
                topIdx = i;
            }
        }
        return topIdx;
    }
    public static void main(String[] args) {
        String[] names = {"victor", "hose", "milelo", "fony", "suzhan", "zanne"};
        int[] scores = {93, 71, 86, 83, 95, 58};

        int i = topIndex(scores);
        System.out.printf("1등 : %s(%d)", names[i], scores[i]);
    }
}

