package conditional;

public class Quiz7 {

	public static void main(String[] args) {
		
		// char타입 변수를 선언하고 문자 b,c,d 중에서 하나를 입력하세요.
		// 문자에 해당하는 동물을 출력하세요
		
		char animal = 'd'; // b,c,d
		
		switch (animal) {
		case 'b': 
			System.out.println("새");
			break;
		case 'c':
			System.out.println("고양이");
			break;
		case 'd':
			System.out.println("강아지");
			break;
		}

	}

}
