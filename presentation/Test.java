package presentation;
import account.Account;
import service.*;
import dao.*;

public class Test {
	
	
	public static void main(String args[]) {
		
	IData data = new Data();
	IService service = new Service();
	Account a1 = new Account();
	
	service.setData(data);
	
	System.out.println(data.getAccounts());
	/*
	Service service = new Service();
	service.setData(d);
	*/
	//System.out.println(d.getAccounts());
	
	}
	
}

