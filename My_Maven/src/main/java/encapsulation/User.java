package encapsulation;
import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter pin");
		int a=sc.nextInt();
Bank obj=new Bank();
obj.setPin(a);

obj.validatepin();
	}

}
