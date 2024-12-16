package dao;
import java.util.Collection;

import account.*;
public interface IData {

public void addAccount(Account a1);
public void deleteAccount(int id);
public Account findAccount(int id);
public Collection<Account> getAccounts();

}