
public class IsAMultipleOf {
	public static void main(String[] args) {

		int startNum = 2000;
		int divisor = 400;
		System.out.println("Is " + startNum + " a multiple of " + divisor + "? " + multFind(startNum, divisor));
	}

	public static boolean multFind(int startNum, int divisor) {
		int remainder = startNum % divisor;
		boolean tf = (remainder == 0);
		return tf;
	}
}
