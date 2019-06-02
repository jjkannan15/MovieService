import java.util.Scanner;

public class BalancedStringCheck {

	public static void main(String[] args) {
		int outputValue = 0;
		System.out.println("Please enter the input string to check : ");
		Scanner scan = new Scanner(System.in);
		String inputString = scan.nextLine();
		inputString = inputString.replaceAll("c", "a").replaceAll("b", "d");
		for (int i = 0; i < inputString.length(); i++) {
			outputValue = outputValue ^ inputString.charAt(i);
		}
		System.out.println(outputValue > 0 ? "False" : "True");
	}

}
