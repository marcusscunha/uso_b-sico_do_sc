package aplicacao;


	import java.util.Locale;
import java.util.Locale.Category;
import java.util.Scanner;

	public class uso_do_scanner_flut_ponto {

		

		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc= new Scanner (System.in);

			double x;
			x=sc.nextDouble();
			System.out.printf("voce digitou: %.9f%n",x);

			sc.close();
		}

	}


