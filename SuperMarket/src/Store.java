import java.util.ArrayList;
import java.util.Scanner;


public class Store {
	
	
	public ArrayList<Customer> abc=new ArrayList<Customer>();
	
	public void addSale()
	{
		int n=0;
		boolean bbb=true;
		while(bbb==true)
		{
			Scanner kbTaker=new Scanner(System.in);
			System.out.println("Enter the name of the customer. Type \"EXIT\" to abort");
			String zyx=kbTaker.next();
			if (zyx.toUpperCase().equals("EXIT"))
			{
				break;
			}
			Scanner objTaker=new Scanner(System.in);
			System.out.println("Enter the amount of the total sale of the customer.  Type \"EXIT\" to abort");
			double amount1=objTaker.nextDouble();
			if (zyx.toUpperCase().equals("EXIT"))
			{
				break;
			}
			Customer setter=new Customer(zyx, amount1);
			/*Customer Customer=new*/ abc.add(n,setter);
			n++;
		}

	}
	
	public String nameOfBestCustomer()
	{
		double highest=0;
		double highest1=0;
		int m=0;
		int k=0;
		//double xyz=abc.get(xyz);
		for (int j=0; j<abc.size();j++)
		{
			highest=abc.get(j).getAmount();		
			if (highest>highest1)
			{
			highest1=highest;
			m=j;
			}
		}
		String winnerName=abc.get(m).getName();
		return winnerName;
	}



}
