package chapter15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * File에서 데이터 읽어서 처리하기
 */
public class StreamEx6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("product.txt"));
		/*
		 * br.lines() :Reader를 통한 데이터를 Stream<String> 생성
		 * 			   Product.txt의 내용을 Stream<String> 생성
		 * map(Function) s : String : Stream<String>에서
		 * 				 리턴 값 : car : Stream<Car>로 바뀜
		 */
		br.lines().map(s->{
			//10,3,BMW,3,싫어요
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
		}).filter(c->c.getCar().equals("K9")).forEach(c->System.out.println(c));
	}

}
