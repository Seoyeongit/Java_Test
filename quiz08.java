package q01.quiz02;

import java.util.Scanner;

public class quiz08 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("전체 학생수를 입력하세요.");
		int total = input.nextInt();
		
		int score = 0;
		int highScore = 0;
		
		for(int i=0; i<total; i++) {
			System.out.println("학생의 점수를 입력하세요.");
			score = input.nextInt();
			if (score > highScore) {
				highScore = score;
			}
		}
			
		System.out.println("최고 성적값 = " + highScore);
		

	}

}
