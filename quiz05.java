package q01.quiz02;

import java.util.Scanner;

public class quiz05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number = (int)(Math.random()*100);
		
			while (true) {
				System.out.println("0~100까지 숫자를 추측해 보세요?");
				int guess = input.nextInt();
				
				if ( number > guess) {
					System.out.println("당신의 추측한 숫자의 값이 낮습니다.");
				} else if (number < guess ){
					System.out.println("당신의 추측한 숫자의 값이 높습니다.");
				} else if (number == guess) {
					System.out.println("숫자가 " + number + "정확히 맞추었습니다.");
					 break;	}
			}
		
			

	}	
}
		
		

	


