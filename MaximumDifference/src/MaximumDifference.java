import java.util.Scanner;

public class MaximumDifference {

	public static void main(String[] args) {
		System.out.println("Please enter the Number of Input : ");
		int previousValue = 0;
		Scanner scan = new Scanner(System.in);
		int inputValueSize = scan.nextInt();
		int[] inputValues = new int[inputValueSize];
		for(int i=0; i<inputValueSize ; i++) {
			System.out.print("enter " + (i+1) + " value :");
			inputValues[i]=scan.nextInt();
		}
		System.out.println("The Max difference is : " + getMaximumDifference(inputValues));
	}
	
	public static int getMaximumDifference(int[] inputValues) {
		int maxDifference = 0;
		if(inputValues.length > 1) {
			int maxValue = inputValues[inputValues.length -1];
			for(int i = inputValues.length-2 ; i >=0; i--) {
				 if(inputValues[i] < maxValue) {
					 maxDifference = Math.max(maxDifference, maxValue-inputValues[i]);
				 } else {
					 maxValue = inputValues[i];
				 }
			}
		}
		return maxDifference;
	}

}
