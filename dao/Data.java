package dao;

import account.Account;

import java.util.Collection;
import java.util.HashMap;

public class Data implements IData {
	

	HashMap<Integer, Account> accounts = new HashMap() ;
	
	public Data(){
		Account a1 = new Account();
		accounts.put(a1.getId(), a1);
		
		Account a2 = new Account();
		accounts.put(a2.getId(), a2);
		
		Account a3 = new Account();
		accounts.put(a3.getId(), a3);
		
		Account a4 = new Account();
		accounts.put(a4.getId(), a4);
	}
	
	public void addAccount(Account a) {
		accounts.put(a.getId(), a);
	}
	
	public void deleteAccount(int id) {
		accounts.remove(id);
	}
	
	public Account findAccount(int id) {
			
		return accounts.get(id);
	}
	
	public Collection<Account> getAccounts() {
		
		return accounts.values() ;
	}

	
	
	
	
}