package conditional;

public class Quiz5 {

	public static void main(String[] args) {
		// 월을 저장할 변수를 선언하고 1~12 사이의 값을 저장하세요.
		// 그리고 월에 해당하는 계절을 출력하세요
		int month= 1;
		
		if (month >= 3 && month <= 5) {
			System.out.println("현재 계절은 봄입니다.");
		} else if (month >= 6 && month <= 8) {
			System.out.println("현재 계절은 여름입니다.");
		} else if (month >= 9 && month <= 11) {
			System.out.println("현재 계절은 가을입니다.");
		} else if (month == 1 || month == 2 || month == 12) {
			System.out.println("현재 계절은 겨울입니다.");
		} else {
			System.out.println("월이 잘못되었습니다.");
		}
	}

}
