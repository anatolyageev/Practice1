package ua.nure.ageev.practice1;

public class SumOfTwoDigit {

	private static void usage() {
		System.out.println("Usage: java " + "ua.nure.ageev.practice1 X Y");
	}

	public static int sum(int x, int y) {
		return x + y; 
	}

	public static void main(String[] args) {
		if (args.length != 2) {
			usage();
			return;
		}
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int sum = sum(x, y);
		System.out.println("sum of x=" + x + ", y= " + y + " Sum --> " + sum);
	}

}
