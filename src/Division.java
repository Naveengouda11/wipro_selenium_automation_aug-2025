	import java.util.Scanner;
public class Division {
		static float Division(float x,float y) {
			float res = x / y;
			return res;		
		}

		public static void main(String[] args) {
			Scanner sc  = new Scanner(System.in);
			System.out.println("Enter Num1 : ");
			float num1 = sc.nextInt();
			System.out.println("Enter Num2 : ");
			float num2 = sc.nextInt();
			float res;
			res = Division(num1, num2);
			System.out.println("Division of number is : " + res);	

		}

}
