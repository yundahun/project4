package conditional;

public class Quiz8 {

	public static void main(String[] args) {
		
		// switch문을 사용할것!
		
		// 학생의 점수를 저장할 변수를 선언하고 0~99 사이의 값을 저장하세요.
		
		// 점수가 90~99이면 "수"
		// 점수가 80~89이면 "우"
		// 점수가 70~79이면 "미"
		// 그 외는 "양"을 출력하세요
		
		int score = 75;
		int value = score / 10; // 억지로 풀어버리기 => if문 채택이 정배
		
		switch (score) {
		case 9:
			System.out.println("수");
			break;
		case 8:
			System.out.println("우");
			break;
		case 7:
			System.out.println("미");
			break;
		default:
			System.out.println("양");
		}

	}

}
