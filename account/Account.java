package account;

public class Account {
	static int unique_id = 0;
	private int id = 0;
	private int id_client;
	private double solde;
	
 public Account(){
	 
		 this.id = ++Account.unique_id;
		 this.id_client = 2 ;
		 this.solde = 100;
	
		}
	
	Account(int idc , double somme){
	 this.id = ++Account.unique_id;
	 this.id_client = idc ;
	 this.solde = somme;
	}
	
	
	public int getId() {
		return this.id;
	}
	
	
	public int getIdClient() {
		return this.id_client;
	}
	public void setIdClient(int idc) {
		this.id_client = idc;
	}
	
	public double getSolde() {
		return this.solde;
	}
	public void setSolde(double somme) {
		this.solde = somme;
	}
	
	public String toString() {
		return "id : " + this.id + " id_client : " + this.id_client + " solde :"  + this.solde ;
	}
	
	
	
}