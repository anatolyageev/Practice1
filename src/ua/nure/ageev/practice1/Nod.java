package ua.nure.ageev.practice1;

public class Nod {

	private static void usage() {
		System.out.println("Usage: java " + "ua.nure.ageev.practice1 X Y and must be positive ");
	}

	public static int nod(int x, int y) {
		while (x != y) {
			if (x > y)
				x -= y;
			else
				y -= x;
		}
		return x;
	}

	public static void main(String ...args) {
		if (args.length != 2) {
			usage();
			return;
		}
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		if(x<0 || y<0){
			usage();
			return;
		}
		
		int nod = nod(x, y);
		System.out.println("NOD x=" + x + ", y=" + y + " --> " + nod);
	}

}