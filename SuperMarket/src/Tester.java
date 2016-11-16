import java.util.Scanner;


public class Tester {

	public static void main(String[] args) {
		Store winner=new Store();
		winner.addSale();
		System.out.println(winner.nameOfBestCustomer());
	}

}
