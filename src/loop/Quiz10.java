package loop;

public class Quiz10 {

	public static void main(String[] args) {
		// 중첩 반복문을 사용해서 직각삼각형을 그려보세요
		
		for(int i = 1; i <= 5; i++) { // 높이
			
			for (int j = 1; j <=i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}

	}

}
