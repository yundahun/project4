package loop;

public class Ex3 {

	public static void main(String[] args) {
		// 1~10 까지의 합계 구하기
		// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10
		
//		int sum = 0;
//		sum = sum + 1;
//		sum = sum + 2;
//		sum = sum + 3;
//		sum = sum + 4;
//		sum = sum + 5;
//		sum = sum + 6;
//		sum = sum + 7;
//		sum = sum + 8;
//		sum = sum + 9;
//		sum = sum + 10;
//		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		
		//반복문으로 처리
		int num = 1; // 더할 수 숫자
		int sum = 0; // 합계를 저장할 변수
		
		while(num <= 10) {
			sum = sum + num;
			num++;
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	}

}
