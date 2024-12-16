package service;

import java.util.Collection;
import account.Account;
import dao.*;


public  class Service implements IService {
	
 private IData data;


public void deposit(int id, double somme) {
	data.findAccount(id).setSolde(data.findAccount(id).getSolde() + somme);
	
	
}


public void transfert(int id, int id2, double somme) {
	      withdraw(id,somme);
	      deposit(id2,somme);
	      
	
}

public void withdraw(int id, double somme) {
	data.findAccount(id).setSolde(data.findAccount(id).getSolde() - somme);
	
}



public void setData(IData data) {
	this.data = data;
	
}


public Account consulter(int id) {
	
	return data.findAccount(id);
}
 


 





}