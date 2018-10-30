import java.util.Scanner;
public class MainApp {
	
	static Scanner m1=new Scanner(System.in);

	public static void main(String[] args) {
	int ch;
		int sav = 0;
	Account[] accRec = new SavingAccount[10];
	do
	{
	System.out.println("Choose an action");
	System.out.println("1. Open an account");
	System.out.println("2. Perform a transaction");
	System.out.println("3. exit");
	ch= m1.nextInt();
	
	switch(ch)
		{
	case 1: System.out.println("Enter your name");
			m1.nextLine();
			String name=m1.nextLine();
			System.out.println("Enter amount you want to deposit");
			int amt=m1.nextInt();
			accRec[sav] = new SavingAccount(amt,name);
			System.out.println("Account created");
			System.out.println("Account Number: " +(accRec[sav].getAnum()));
			sav = sav + 1;
			
	break;
	
	case 2:	System.out.println("Enter your Account number");
			int count3 = 0; 
			int accountNum = m1.nextInt();
			for( Account current: accRec )
			{
				if (current.getAnum() == accountNum)
				{
					break;
				}
				count3++;
			}
	 
			System.out.println("Choose one option");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			int choice = m1.nextInt();
			switch(choice)
			{
			case 1: accRec[count3].deposit();
			break;
			case 2: accRec[count3].withdraw();
			break;
			}
			break;
			case 3: System.exit(0);
	
		}
	}while(ch != 3);
	
	}
}
