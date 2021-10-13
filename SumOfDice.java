package labProject.three;
import java.util.Random;
public class SumOfDice {
	Random random= new Random();

	int []occurrance=new int[13];

	public int[]getSimulatedResults(){
		return occurrance;
	}

	private int rollDice() {

		int max=6;
		int min=1;
		 int range= max-min+1;
		 int result=(int)(Math.random()*range+min);

		 return result;	
	}
	public void runSimulation(){
		for(int i=0;i<100;i++) {
			int roll1=rollDice();
			int roll2=rollDice();
			int sum= roll1+roll2;
			occurrance[sum]++;
		}
	}






}
