package elavator;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;

		// Take input once
		System.out.println("Enter Position: ");
		a = sc.nextInt();

		System.out.println("Enter How many users: ");
		b = sc.nextInt();

		// Create objects after getting input
		Lift lift = new Lift(a, b);
		LiftServiceImpl liftService = new LiftServiceImpl();

		liftService.moveTo(lift);
		liftService.close(lift);

		sc.close(); // Always close scanner
	}
}
