import java.util.Random;

public class DmvSimulator {
	public static void main(String[] args) {
		System.out.println("Welcome to the DMV:(");
		System.out.println("You will be given a random number between 1 and 100.");
		System.out.println("Please wait until your number has been called.");

		Random random = new Random();
		int yourNum = random.nextInt(100) + 1;
		System.out.println("Your number is " + yourNum + " please take a seat it will not take that long :|");

		int nextNum = yourNum + 1;

		for (int i = nextNum; i < 101; i++) {
			System.out.println("Next Number is " + i + ": Please step up to the desk!");

			if (i == 100) {
				for (int j = 1; j < yourNum; j++) {
					System.out.println("Next Number is " + j + ": Please step up to the desk!");
				}
			}

		}

		System.out.println("Last Number is " + yourNum + ": Please step up to the desk!!!!");

		System.out.println(
				"You do not have the required documents for me to file this for you, leave now, we are closed!!!!");
	}
}
