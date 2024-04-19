package chapter15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Function;

/*
 * product.txt 파일을 읽어서 6월달 그랜저 판매수량 출력하기
 */
public class Exam4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("product.txt"));
		
		Function<String, Car> f= s-> {
			String[] str = s.split(",");
			String temp = "";
			try {
				temp = str[4];
			}catch(ArrayIndexOutOfBoundsException e) {
				temp = "";
			}
			return new Car(Integer.parseInt(str[0]), 
					Integer.parseInt(str[1]), str[2], 
					Integer.parseInt(str[3]), temp);
		};
		int sum = br.lines().map(f).filter(c->c.getCar().equals("그랜저")&& c.getCon() == 2&& c.getMonth() == 6).mapToInt(Car :: getQty).sum(); 
		System.out.println(sum);
		
		//6월 그랜저 판매 레코드 조회 
		br = new BufferedReader(new FileReader("product.txt"));
		br.lines().map(f).filter(c->c.getCar().equals("그랜저")&& c.getCon() == 2&& c.getMonth() == 6).forEach(c->System.out.println(c)); 
	}
	
}
