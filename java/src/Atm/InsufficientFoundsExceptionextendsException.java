package Atm;

public class InsufficientFoundsExceptionextendsException {
int needs;
InsuffientFundsException(int needs)
{
	this.needs=needs;
}
int getneeds();
{
['	return this.needs;
}
}
class Acciunt
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
	void withdraw(int amount) throwsInsufficentFundsException
	{
		System.out.println("trying towithdraw...:"+amount);
		System.out.println("balance in acciunt...:"+this.balance);
		if(amount<=this.balance)
		{
			System.out.println(pls collect the cash:"+amount");
			this.balance=this.balance=amount;
			{
				int needs=amount.this.balance;
				throw new InsufficentFundsException(needs);
				
			}
		}
}
	class Bank{
		public static void main(Strings[] args)
		{
			Account acc.withdraw(4000);
			
			System.out.println()
		}
	}
}
