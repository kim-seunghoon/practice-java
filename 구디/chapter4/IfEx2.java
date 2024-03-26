package chapter4;
/*
 * 중첩 if구문 = 내부에 if문이 또 존재 가능
 */
public class IfEx2 {

	public static void main(String[] args) {
		int score = 80;
		if (score >= 60) {
			System.out.println("합격");
			if (score >= 80) {
				System.out.println("좋은 성적입니다.");
			}
		} else {
			System.out.println("불합격");
			if (score < 30) {
				System.out.println("포기하세요");
			}
		}
	}

}
