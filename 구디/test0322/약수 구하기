package test0322;
/*
Command 라인에서 숫자를 입력받아 숫자의 약수를 출력하기
    java Test7 10
    int num = Integer.parseInt(args[0]);
  [결과]
  10의 약수 : 1,2,5,10,
*/
public class Test7 {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("커맨드 라인에 숫자를 입력하세요");
		} else {
			for (String str : args) {
				int num = Integer.parseInt(str);
				System.out.print(num + "의 약수 : ");
				for (int i = 1; i <= num; i++) {
					if (num % i ==0) {
						System.out.print(i + ((i >= num) ? " " : ", "));
					}
				}
					
				}
			}
			}
		
	}	
