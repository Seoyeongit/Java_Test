package q01.quiz02;

import java.util.Scanner;

public class quiz02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("체중을 입력하세요.");
		double weight = input.nextDouble();
		
		System.out.println("키를 입력하세요.");
		double height = input.nextDouble();
		
		double Bmi = ( weight / (height * height) );
		
		if (Bmi < 18.5) {
			System.out.println("저체중 입니다.");
		} else if ((Bmi >= 18.5) && (Bmi < 25)) {
			System.out.println("정상 체중 입니다.");
		} else if ( (25 <= Bmi) && (Bmi < 30) ) {
			System.out.println("과체중 입니다.");
		} else if(Bmi >= 30) {
				System.out.println("비만 입니다.");
			}
			System.out.println("Bmi = " + Bmi);
		}
		
	}

