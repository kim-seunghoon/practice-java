package chapter15;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

/*
 * Supplier 관련 인터페이스
 * T getXXX() : 매개변수는 없고 리턴 값만 존재
 * 
 * Supplier<T> : T get() T형의 리턴 값
 * BooleanSupplier : boolean getAsBoolean() 
 * DoubleSupplier : double getAsDouble()
 * IntSupplier : int getAsInt()
 * LongSupplier : long getAsInt()
 *  
 */
public class LambdEx3 {

	public static void main(String[] args) {
		Supplier<String> s1 = ()->{ return "java";};
		//한 줄 표현
//		Supplier<String> s1 = ()-> "java";
		System.out.println(s1.get());
		
		//임의의 주사위 값 리턴
		IntSupplier s2 = ()-> {
			return (int)(Math.random() * 6) + 1;
		};
		//한 줄 표현
//		IntSupplier s2 = ()-> (int)(Math.random() * 6) + 1;
		System.out.println(s2.getAsInt());
		
		double [] arr = {1,1.2,2.4,5.3,10,3};
		DoubleSupplier s3 = ()-> {
			double sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			return sum;
		};
		System.out.println(s3.getAsDouble());
	}

}
