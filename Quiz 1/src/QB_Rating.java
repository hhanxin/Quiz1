import java.util.Scanner;
public class QB_Rating {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("what is type TD:");
		double TD = input.nextDouble();
		System.out.println("What is type Yards:");
		double yards= input.nextDouble();
		System.out.println("what is Interceptions:");
		double INT= input.nextDouble();
		System.out.println("what is completions:");
		double comp= input.nextDouble();
		System.out.println("what is ATT:");
		double ATT= input.nextDouble();
		double a = ((comp / ATT) - 0.3) * 5;
		double b = ((yards/ATT) - 3) * 0.25;
		double c = (TD / ATT) * 20;
		double d = 2.375 - ((INT / ATT) * 25);
		double QB_rating  = ((a+b+c+d)/6)*100;
		System.out.printf("The rating is %.2f: ", QB_rating);
	}

}
