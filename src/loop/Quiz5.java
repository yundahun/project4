package loop;

public class Quiz5 {

	public static void main(String[] args) {
		
		// 1부터 100까지의 수 중에서 3의 배수만 출력하세요.
		
		
		// continue 사용 버전
		for(int i = 1; i <= 100; i++) {
			if (i % 3 != 0) {
				continue;
			}
			System.out.println(i);
		}
		
		// continue 안쓴 버전
		for(int i = 1; i <= 100; i++) {
			if (i % 3 == 0 ) {
				System.out.println(i);
			}
		}

	}

}
