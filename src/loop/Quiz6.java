package loop;

public class Quiz6 {

	public static void main(String[] args) {
		
		// for문을 사용해 1부터 100까지 더하는 코드를 작성하세요.
		// 단 중간에, 합이 500이 넘어가면 중단합니다.
		
		//for 문이 종료되기전 num과 sum값을 출력하세요.
		
		int sum = 0;
		int i;
		
		for (i = 1; 1 <=100; i++) {
			sum = sum + i;
			
			
		if (sum >= 500) {
			break;
			}
		
		}
		System.out.println("i: " + i + ", sum: " + sum);

	}

}
