package Question1;
import java.util.Scanner;
public class QBrating {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please type TD :");
		double TD = input.nextDouble();
		System.out.print("Please type Yards :");
		double Yards = input.nextDouble();
		System.out.print("Please type INT :");
		double INT = input.nextDouble();
		System.out.print("Please type comp :");
		double comp = input.nextDouble();
		System.out.print("Please type ATT :");
		double ATT = input.nextDouble();
		double a = (comp / ATT - 0.3) * 5;
		double b = (Yards / ATT - 3) * 0.25;
		double c = (TD / ATT) * 20;
		double d = 2.375 - (INT / ATT) * 25;
		double passerRating = 100 * (a + b + c + d) / 6;
		System.out.println("Passer Rating is :" + passerRating);
	}

}
