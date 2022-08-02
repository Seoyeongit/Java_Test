package q01.quiz02;

import java.util.Scanner;

public class quiz04 {

	public static void main(String[] args) {
		
		System.out.println("가위(0), 바위(1), 보(2) 중 숫자 0, 1, 2 중 하나의 숫자를 입력하세요.");
		Scanner input = new Scanner(System.in);
		int i = (int)(Math.random()*3);
		int a = input.nextInt();
		
		if (a == 0) {
			if (i == 1) {
			System.out.println("당신이 졌습니다.");
		} else if (i == 2) 
			System.out.println("당신이 이겼습니다.");
		} else{
			System.out.println("비겼습니다.");
			}

		
		 if (a == 1) {
			 if (i == 0) {
			System.out.println("당신이 졌습니다.");
		} else if (i == 2) {
			System.out.println("당신이 이겼습니다.");
		} else {
			System.out.println("비겼습니다.");
		}

			 
		if (a == 2) {
			if (i == 1) {
			 System.out.println("당신이 졌습니다.");
			 } else if ( i == 0 ) {
				 System.out.println("당신이 이겼습니다.");
			 } else {
				 System.out.println("비겼습니다.");
			 }
	}
 }
		 
	}
	
}

