package aplicacao;




import java.util.Scanner;

	public class uso_do_scanner_flut_virgula {


		public static void main(String[] args) {
			
			Scanner sc= new Scanner (System.in);

			double x;
			x=sc.nextDouble();
			System.out.printf("voce digitou: %.9f%n",+x);

			sc.close();
		}

	}


