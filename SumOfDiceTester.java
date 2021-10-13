package labProject.three;

import java.util.Arrays;

public class SumOfDiceTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//sod is sum of dice
	SumOfDice sod = new	SumOfDice();
	
	sod.runSimulation();
	int[] result = sod.getSimulatedResults();
	
	System.out.println("Dice sums: 100 rolls");
	System.out.print(Arrays.toString(result));
	System.out.println();
		
	System.out.println("sum of dice         occurances");
	System.out.println("------------        ------------");
	
	
	for(int i=2;i<=12;i++) {
		System.out.println(i+ "                   "+result[i]);
	}
	System.out.println();
	for(int i=2;i<=12;i++) {
		System.out.print(i+":");
		
	for(int j=1;j<result[i];j++) {
		System.out.print("*");
	}
	System.out.println();
	}
		
		
		
		
	}

}
