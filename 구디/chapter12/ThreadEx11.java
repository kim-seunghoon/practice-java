package chapter12;
/*
 * 스레드에서 사용되는 주요 메서드
 * 1. start() : 스레드의 시작. 스택 영역 병렬화. run()메서드 호출. new 상태 -> Runnable  상태로 변경
 * 2. Run() : 스레드가 실행하는 메서드. 오버라이딩
 * 3. join() : 스레드가 종료할 때까지 호출한 메서드가 대기
 * 4. sleep(밀리초) : static 멤버. 밀리초동안 대기
 * 5. setDaemon(true) : true 설정 시 데몬스레드로 설정. 기본값 false
 * 6. interrupt() : InterruptedException 예외 발생
 * 7. setPriority(int) : 우선순위 설정 1~10 사이의 값. 기본값 : 5, 우선순위가 높은 경우 스케줄러의 선택을 받을 확률이 높다.
 * 8. yield() : Running 상태를 Runnable 상태로 변경
 * 9. stop() : 스레드 강제 종료. 사용하지 않도록 권장 됨 
 */
class InterruptThread extends Thread {
	public void run() {
		System.out.println("자고 있습니다. 깨우지 마세요");
		try {
			sleep(100000);
		}catch(InterruptedException e) {
			System.out.println("누가 깨웠나요");
			e.printStackTrace();
		}
	}
}
public class ThreadEx11 {

	public static void main(String[] args) throws InterruptedException {
		InterruptThread t1 = new InterruptThread();
		t1.start();
		Thread.sleep(2000);
		t1.interrupt(); //t1 객체에 InterruptedException 발생
	}

}
