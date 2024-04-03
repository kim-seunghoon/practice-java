package test0401;

public class Snippet {
	public static void main(String[] args) {
		
		
		/*
		1. 인터페이스 내에 메서드를 적합하게 선언한 형태 2개를 고르시오. 정답 : 1번, 3번XXX 2번
		(1) void methoda(); 
		(2) public double methoda();
		(3) public final double methoda(); ->final오류
		(4) static void methoda(double d1); ->static 오류, 구현부 필요
		(5) protected void methoda(double d1); ->protected 오류, 인터페이스 모든 멤버는 public
		
		2. 2번째 줄과 동일한 의미를 갖는 문장 3개를 고르시오. 정답 : 1번, 2번, 3번
		
		1. public interface Foo { 
		2. int k = 4;
		3. }
		
		(1) final int k = 4;      (2) public int k = 4;
		(3) static int k = 4;   (4) abstract int k = 4;
		(5) volatile int k = 4; (6) protected int k = 4;
		
		
		4. 다음 소스를 보고 보기 중 16라인에 추가되면 
		java.lang.ClassCastException을 발생시키는 문장을 선택하시오. 정답 : 2번
		10. interface Foo {}
		11. class Alpha implements Foo { } 
		12. class Beta extends Alpha {} 
		13. class Delta extends Beta { 
		14. public static void main( String[] args) { 
		15. Beta x = new Beta(); 
		16. // insert code here 
		17. } 
		18. } 
		(1). Alpha a = x; 
		(2). Foo f= (Delta)x; 
		(3). Foo f= (Alpha)x; 
		(4). Beta b = (Beta)(Alpha)x; 
		
		5. 다음 A 인터페이스를 상속 받아서 새로운 B 인터페이스를 생성하고
		자 한다. 다음 보기 중 올바른 문장을 선택하시오. 정답 : 1번
		1. public interface A { 
		2.    String DEFAULT_GREETING = “Hello World”; 
		3.    public void method1(); 
		4. } 
		(1). public interface B extends A { } 
		(2). public interface B implements A {} 
		(3). public interface B instanceOf A {} 
		(4). public interface B inheritsFrom A { }
		 
		*/
	}
}

