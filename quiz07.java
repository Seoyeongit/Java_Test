package q01.quiz02;

import java.util.Scanner;

public class quiz07 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("매달 넣을 원금을 입력해주세요.");
		int money = input.nextInt();
		
		System.out.println("연이율(~~%)를 입력해주세요.");
		double month_interest_rate = 1+((input.nextDouble()/100)/12);
	
		
		
		
		System.out.println( "6개월 후 적금 총금액은 원금 " + money + "원 입니다.");


		
	}
	
}	