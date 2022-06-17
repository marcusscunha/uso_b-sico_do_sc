import java.util.Scanner;

public class uso_do_scanner {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);

		String x;
		x=sc.next();
		System.out.println("voce digitou: "+x);

		sc.close();
	}

}
