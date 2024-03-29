package loop;

public class Quiz8 {

	public static void main(String[] args) {
		// 구구단에서 짝수는 생략하고 홀수단만 출력하세요.
		
		for (int dan = 2; dan <= 9; dan++) {
			
			if( dan % 2 == 0) {
				continue;
			}
			
			for(int times = 1; times <= 9; times++) {
				
				System.out.println(dan + "X" + times + "=" + (dan * times));
			}
			System.out.println();
		}
	}

}
