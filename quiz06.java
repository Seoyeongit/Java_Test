package q01.quiz02;

import java.util.Scanner;

public class quiz06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num = 0;
		int count = 0;
		int count2 = 0;
		int sum = 0;
		
		while(true) {
			System.out.print("정수를 입력하세요( 단, 0을 입력하면 종료됩니다.)");
			num = input.nextInt();
			sum += num;
			if (num<0) {
				count2 += 1;
			} else if (num>0) {
				count += 1;
			} else {
				System.out.println("양의 정수 숫자 : " + count);
				System.out.println("음의 정수 숫자 : " + count2);
				System.out.println("전체 평균값 : " + (sum/(count+count2)));
				break;
			}
			
			
		}


	

	}

}
