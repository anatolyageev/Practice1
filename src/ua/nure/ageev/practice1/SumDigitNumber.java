package ua.nure.ageev.practice1;

public class SumDigitNumber {

	private static void usage() {
		System.out.println("Usage: java " + "ua.nure.ageev.practice1 ned number not more then 2^31");
	}

	public static int sumDigit(int num) {
		if (num < 10) {
			return num;
		}
		return num % 10 + sumDigit(num / 10);
	}

	public static void main(String[] args) {
		if (args.length != 1 || Integer.parseInt(args[0])<0 ) {
			usage();
			return;
		}
		int x = Integer.parseInt(args[0]);
		int sum = sumDigit(x);
		System.out.println("Sum of digit of x =" + x + " --> " + sum);
	}

}