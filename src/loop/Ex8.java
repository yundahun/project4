package loop;

public class Ex8 {

	public static void main(String[] args) {
		
		// continue를 사용하여 1~10 사이의 홀수들의 합 구하기
		
		int sum = 0; // 합계
		
		for(int i = 1; i <= 10; i++) {
			if (i % 2 == 0) { // i가 짝수라면
				continue; // 다음 코드를 수행하지 않고 skip
			}
		
			sum = sum + i; // i가 홀수라면 sum에 더하기
		}
		
		System.out.println("1부터 10까지의 홀수들의 합은 " + sum + "입니다.");
	}

}
