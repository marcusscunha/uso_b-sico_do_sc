package aplicacao;


	import java.util.Scanner;

	public class uso_do_scanner_num {

		public static void main(String[] args) {
			Scanner sc= new Scanner (System.in);

			int x;
			x=sc.nextInt();
			System.out.println("voce digitou: "+x);

			sc.close();
		}

	}


