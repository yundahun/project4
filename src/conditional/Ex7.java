package conditional;

public class Ex7 {

	public static void main(String[] args) {
		int time = 9;
		
		switch (time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		default:
			System.out.println("외근을나갑니다.");
		}
		

	}

}
