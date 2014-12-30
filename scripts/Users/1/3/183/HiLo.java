import java.util.Random;
import java.util.Scanner;

public class HiLo {

	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {

	//	System.out.println("Guess the number! If you want to stop input 0.");
		int num = new Random().nextInt(100)+1, guess = 101;// gets num between 1 and 100
		System.out.println(num);//give to teacher prog
		System.out.println("correct");
		while (true) {
			while (guess != num) {
				guess = s.nextInt();
				if (guess > num)
					System.out.println("too high");
				if (guess < num)
					System.out.println("too low");
				if (guess == 0) {// if its zero say goodbye and quit the program
					System.out.println("goodbye");
					System.exit(0);// exit program
				}
			}
			if (guess == num) {
				System.out.println("correct");
				//num = new Random().nextInt(100);// gets another number between 1 and 100
			}
		}
	}
}
