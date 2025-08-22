import java.util.Scanner;
public class Multiplication {

		static int Mul(int x,int y) {
			int res = x * y;
			return res;	
		}
		
		public static void main(String[] args) {
			Scanner sc  = new Scanner(System.in);
			System.out.println("Enter Num1 : ");
			int num1 = sc.nextInt();
			System.out.println("Enter Num2 : ");
			int num2 = sc.nextInt();
			int res;
			res = Mul(num1, num2);
			System.out.println("Multiplicaton of number is : " + res);
			
		}

	}

