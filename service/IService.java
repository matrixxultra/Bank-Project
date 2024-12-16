package service;
import dao.*;
import account.Account;

public interface IService {
	
	public void deposit(int id, double somme);
	public void transfert(int id , int id2 , double somme );
	public void withdraw(int id, double somme);
	public Account consulter(int id);
	public void setData(IData data);
}