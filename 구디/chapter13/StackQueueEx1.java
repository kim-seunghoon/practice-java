package chapter13;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * Stack : LIFO 
 * 	Stack 클래스 : Vector 하위 클래스
 * 	주요 메서드
 * 		push(Object) : 객체를 Stack에 추가
 * 		Object pop() : Stack에 저장된 객체를 꺼냄. 제거
 * 		Object peek() : Stack에 저장된 객체를 꺼냄. 조회
 * 
 * Queue : FIFO
 * 	Queue 인터페이스 : LinkedList가 구현 클래스
 * 	주요 메서드
 * 		offer(Object) : 객체를 Queue에 추가
 * 		Object poll() : Queue에 저장된 객체를 꺼냄. 제거
 * 		Object peek() : Queue에 저장된 객체를 꺼냄. 조회
 */
public class StackQueueEx1 {

	public static void main(String[] args) {
		String[] subject = {"java","SQL","JSP","HTML","CSS","JavaScript","Spring"};
		Stack<String> stack = new Stack<>();
		Queue<String> queue = new LinkedList<>();
		for (String s : subject) {
			stack.push(s);
			queue.offer(s);
		}
		System.out.println(stack);
		System.out.println(queue);
		System.out.println("stack에 저장된 요소의 개수 : " + stack.size());
		System.out.println("queue에 저장된 요소의 개수 : " + queue.size());
		System.out.println("stack의 조회 대상 객체 : " + stack.peek());
		System.out.println("stack에 저장된 요소의 개수 : " + stack.size());
		System.out.println("stack의 조회 대상 객체 제거 : " + stack.pop());
		System.out.println("stack에 저장된 요소의 개수 : " + stack.size());
		System.out.println("stack의 조회 대상 객체 제거 : " + stack.pop());
		System.out.println("stack에 저장된 요소의 개수 : " + stack.size());
		System.out.println("queue의 조회 대상 객체 : " + queue.peek());
		System.out.println("queue에 저장된 요소의 개수 : " + queue.size());
		System.out.println("queue의 조회 대상 객체 제거 : " + queue.poll());
		System.out.println("queue에 저장된 요소의 개수 : " + queue.size());
		System.out.println("queue의 조회 대상 객체 제거 : " + queue.poll());
		System.out.println("queue에 저장된 요소의 개수 : " + queue.size());

	}

}
