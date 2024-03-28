package conditional;

public class Quiz6 {

	public static void main(String[] args) {
		// if문을 사용!
		
		// 학생의 점수를 저장할 변수를 선언하고 0~99 사이의 값을 저장하세요.
		
		// 점수가 90~99이면 "수"
		// 점수가 80~89이면 "우"
		// 점수가 70~79이면 "미"
		// 그 외는 "양"을 출력하세요
		
		int score = 96;
		
		if (score >= 90 && score <= 99) {
			System.out.println("수");
		} else if (score >= 80 && score <= 89) {
			System.out.println("우");
		} else if (score >= 70 && score <= 79) {
			System.out.println("미");
		} else {
			System.out.println("양");
		}
	}

}
