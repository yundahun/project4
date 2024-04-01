package loop;

public class Quiz9 {

	public static void main(String[] args) {
		// 중첩반복문을 사용해서 직사각형을 그려보세요
		
		int m = 3;
		int n = 5;
		for(int i =1; i <= m; i++) {
			for(int j= 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
