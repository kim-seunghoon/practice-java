package chapter5;
/*
 * str 문자열 내에 각 소문자의 갯수를 출력하기
 * 소문자의 갯수만 조회
 * 갯수가 1개 이상인 데이터만 출력하기
 */
public class Exam3 {

	public static void main(String[] args) {
		String str = "dasdabsdfbsjkdfsfksnm";
		//소문자의 총 글자수를 세는 방법을 찾았다
		int lowerCaseCount = 0;
		for (int i = 97; i <= 122; i++) {
			
			for (int j = 0; j < str.length(); j++) {
				if((int)str.charAt(j) == i) {
					lowerCaseCount ++;
				}
			}		
		}
        System.out.println(lowerCaseCount);
		
        //배열 인덱스 하나하나에 할당 소문자의 갯수를 저장
        int[] cnt = new int[26];
        for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				cnt[ch - 'a']++;
			}
		}
        //인덱스 하나 하나에 글자를 세겨서 출력
        for (int i = 0; i < cnt.length; i++) {
			if(cnt[i] > 0) {
				System.out.print((char)('a' + i) + " : " + cnt[i] + "개 => ");
				for (int j = 0; j < cnt[i]; j++) {
				System.out.print("*");
			}
				System.out.println();
			}
		}
        
      
	}

}
