package loop;

public class Quiz2 {

	public static void main(String[] args) {
		
		// 반복문을 사용해서 11부터 20까지 합을 구하고 출력하세요.
		int num = 11; // 더할 숫자
		int sum = 0; // 합계를 저장할 변수
		
		while (num <= 20) { // num이 20이 될 때까지 총 10번 수행
			sum = sum + num;
			num++;
		}
		System.out.println(sum);
	}

}
