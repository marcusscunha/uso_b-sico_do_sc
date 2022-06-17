package aplicacao;




import java.util.Scanner;

	public class uso_do_scanner_char {


		public static void main(String[] args) {
			
			Scanner sc= new Scanner (System.in);

			char x;
			x=sc.next().charAt(0);
			System.out.println("voce digitou: "+x);

			sc.close();
		}

	}


