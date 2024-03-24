package exceptions;

class InsufficientException extends Exception
{
	 int needs;
	InsufficientException(int needs)
	{
		this.needs=needs;
	}
	int getNeeds()
	{
		return this.needs;
	}
}
class Account
{
	int balance;
	Account(int amount)
	{
		this.balance=amount;
	}
	int getBalance()
	{
		return this.balance;
	}
	void withdraw(int amount) throws InsufficientException
	{
		System.out.println("trying to withdraw amount="+amount);
		System.out.println("balance in account="+balance);
		if(amount<balance)
		{
			System.out.println("pls collect the cash="+amount);
			 this.balance=balance-amount;
		}
		else
		{
			int needs=amount-balance;
			throw new InsufficientException(needs);
		}
	}
}
 class Bank {


	public static void main(String[] args) {
   Account ac=new Account(6000);
		   System.out.println("intial balance:"+ac.getBalance());
		   try
		   {
			   ac.withdraw(4000);
			   System.out.println("balance:"+ac.getBalance());
			   ac.withdraw(3000);
			   System.out.println("bslance:"+ac.getBalance());
		   }
		   catch(InsufficientException ife)
		   {
			   System.out.println("transaction failed due to less amount:"+ife.getNeeds());
			   
		   }
		   System.out.println("end");
	}

}
