package pkgQuiz1;

import java.util.Scanner;
public class Baseball {
	private static int hits;
	private static int atBats;
	private static int doubles;
	private static int triples;
	private static int homeRuns;
	private static int runs;
	private static int walks; 
	private static String name;
	public static void main (String args[]) {
		
		
		Scanner in = new Scanner(System.in);
	
		System.out.println("How many hits did your player have?");
		hits=in.nextInt();
	
		System.out.println("How many at bats did your player have?");
		atBats=in.nextInt();
	
		System.out.println("How many doubles did your player have?");
		doubles=in.nextInt();
	
		System.out.println("How many triples did your player have?");
		triples=in.nextInt();
	
		System.out.println("How many home runs did your player have?");
		homeRuns=in.nextInt();
	
		System.out.println("How many runs did your player have?");
		runs=in.nextInt();
	
		System.out.println("How many walks did your player have?");
		walks=in.nextInt();
	
		System.out.println("What is your players name?");
		name=in.nextLine();
	
	}

	public double battingAverage() {
		double batAverage=hits/atBats;
		return batAverage;
	}
	public double onBasePercentage() {
		return ((hits+walks)/atBats);
	}
	public double sluggingPercentage() {
		return (((hits-doubles-triples-homeRuns)+(2*doubles)+(3*triples)+(4*homeRuns))/atBats);
	}
	public double onBaseSlugging() {
		return ((hits+walks)/atBats)+(((hits-doubles-triples-homeRuns)+(2*doubles)+(3*triples)+(4*homeRuns))/atBats);
	}
	public double totalBases() {
		return ((hits-doubles-triples-homeRuns)+(2*doubles)+(3*triples)+(4*homeRuns));
	}
	
	
}
