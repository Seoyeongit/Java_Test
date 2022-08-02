package q01.quiz02;

public class quiz09 {

	public static void main(String[] args) {
		
		System.out.println("Pattern A");
		for (int i=0; i<6; i++)	{
			for (int j=0; j<i; j++ ) {
				System.out.print("* "); }
			System.out.println();
		}
		
		System.out.println("Pattern B");
		for (int i=0; i < 6; i++) {
			for (int j = 6 ; j > i; j--) {		
				System.out.print("* ");	 	}
			System.out.println();	
		}

		
		System.out.println("Pattern C");
		for(int i = 0; i < 6 ; i++) {
			for(int j = 5; j>i ; j--) {
				System.out.print("  ");
			}for(int k = 0; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		
		}
		
		System.out.println("Pattern D");
		for(int i = 0 ; i < 6 ; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("  ");
			}for(int k = 6; k > i; k--) {
				System.out.print("* ");
			}
			System.out.println();
		}


	}

}
