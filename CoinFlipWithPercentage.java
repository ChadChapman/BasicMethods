import java.util.*;
public class CoinFlipWithPercentage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// could have used a scanner here or a parameter in a method but seemed
		// like they were not required
		int iter = 0;
		double zerosAmt = 0;
		double onesAmt = 0;

		for (iter = 1; iter <= 1000; iter++) {
			Random randGen = new Random();
			int nextRandNum = randGen.nextInt(2);

			if (nextRandNum == 0) {
				zerosAmt++;
			}
			if (nextRandNum == 1) {
				onesAmt++;
			}
		}
		double pctHeads = (zerosAmt / 1000.0) * 100;
		double pctTails = (onesAmt / 1000.0) * 100;

		System.out.println("Percent Heads = " + pctHeads);
		System.out.println("Percent Tails = " + pctTails);
	}
	}
