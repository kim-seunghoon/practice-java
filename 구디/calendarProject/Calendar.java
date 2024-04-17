package calendarProject;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 * 전체적으로 while(true) 반복 내에서 이루어져야할 것 같음
 * 아이디 입력 -> Scanner로 입력
 * 아이디가 입력되면 메뉴 번호 선택 -> 각 메뉴 번호에대해 if 문으로 나눠 정리
 * 1. 종료 -> while 반복문 나가는 방법 break
 * 2. 조회 -> 달력 알고리즘 가져오기 -> 그다음 어떤 동작을 할 것인지 다시 메뉴를 보여줘야함 
 * 이 동작시 해당 아이디로 된 파일이 만들어져야할 듯 다른 동작과 연계 필요
 * 3. 추가 -> 이벤트 제목을 입력하면 시작시간과 종료 시간을 입력받고, 세부사항 입력시 저장됨.
 *  file 저장 스트림 사용필요해 보이며 해당 일자 부분에 이벤트 개수마다 숫자가 추가되어 표시
 * 4. 이벤트조회 -> 2번 기능 똑같이 쓰면 이벤트가 추가되어 표시된 달력이 출력
 * 5. 변경 -> 이벤트 날짜 입력시 저장된 파일에서 저장된 이벤트 출력
 *  
 */ 
public class Calendar {
	public static void main(String[] args) throws IOException {
	Scanner scan = new Scanner(System.in);
	System.out.print("사용자 아이디를 입력하세요 >> ");
	String id = scan.next();
	File f1 = new File("c:/temp1/"+id);
	f1.createNewFile();
	while(true) {
		int num = scan.nextInt();
		System.out.println("메뉴번호를 선택하시오(1:종료, 2:달력조회, 3:이벤트추가, 4:이벤트조회, 5:이벤트변경, 6:이벤트삭제)");
		switch (num) {
		case 1:
			System.out.println("프로그램을 종료합니다.");
			break;
		case 2:
			

		default:
			break;
		}
	}
	}
}
