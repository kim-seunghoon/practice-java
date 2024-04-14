package chapter11;
/*
 * Wrapper 클래스 : 8개의 기본 자료형을 객체화 하기 위한 클래스 통칭
 * 
 * 기본자료형		Wrapper 클래스
 * boolean		Boolean
 * char			Character
 * byte			Byte
 * short		Short
 * int			Integer
 * long			Long
 * float		Float
 * double		Double
 * 
 * 참조형과 기본자료형 간에 형변환 불가
 * String str = 'A'; (x)
 * 단, 기본자료형을 담당하는 Wrapper 클래스와 자동 변환 가능함
 * Character ch = 'A'; = auto boxing됨
 * char ch2 =new Character('A'); = auto unBoxing 됨
 */
public class WrapperEx1 {

	public static void main(String[] args) {
//		String str = 'A';
		Character ch1 = 'A'; //기본 자료형이 참조 자료형으로 형변환 됨
		//deprecated : 이전 버전에서 사용 가능. 현재 버전에서는 가능하면 사용하지 않도록 표현
		char ch2 = new Character('A'); //객체로 만들어진 데이터를 값만 꺼내오겠다.참조 자료형이 기본자료형으로
	}

}
