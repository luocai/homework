package home;

import java.util.ArrayList;
import java.util.Date;

public class Account {
	 private int id;
	 private double balance ;
	 private double annuallneterestRate;
	 private Date dateCreated;
	 
	 private String name;
	 private ArrayList<Transation> transations = new ArrayList<>();
	 
	 
	 public Account(){
	  this.id = 0;
	  this.balance = 0;
	  this.annuallneterestRate = 0;
	  this.dateCreated = new Date();
	 }
	 public Account(int id, double balance) {
	  super();
	  this.id = id;
	  this.balance = balance;
	 }
	 
	 
	 //Ôö¼ÓµÄ
	 public Account(int id, double balance, String name) {
		super();
		this.id = id;
		this.balance = balance;
		this.name = name;
	}
	public int getId() {
	  return id;
	 }
	 public void setId(int id) {
	  this.id = id;
	 }
	 public double getBalance() {
	  return balance;
	 }
	 public void setBalance(double balance) {
	  this.balance = balance;
	 }
	 public double getAnnuallneterestRate() {
	  return annuallneterestRate;
	 }
	 public void setAnnuallneterestRate(double annuallneterestRate) {
	  this.annuallneterestRate = annuallneterestRate;
	 }
	 public Date getDateCreated() {
	  return dateCreated;
	 }
	 public void setDateCreated(Date dateCreated) {
	  this.dateCreated = dateCreated;
	 }
	 
	 public void withDraw(double money){
	  this.balance = this.balance - money;
	  
	  Transation t = new Transation(new Date(),'w', money, this.balance, "withDraw " +money);
	  transations.add(t);
	 }
	 
	 public void deposit(double money){
	  this.balance = this.balance + money;
	  
	  Transation t = new Transation(new Date(),'d', money, this.balance, "deposit" + money);
	  transations.add(t);
	 }
	 
	 public void printTransations(){
		 
		 for (int i = 0; i < this.transations.size(); i++){
			 System.out.println(this.transations.get(i));
		 }
	 }
	 
	 
	
	 
	 @Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", annuallneterestRate=" + annuallneterestRate + ", name="
				+ name + "]";
	}
	public static void main(String[] args){
		 
		 Account account = new Account(1122, 1000, "George");
		 account.setAnnuallneterestRate(0.015);
		 
		 account.deposit(30);
		 account.deposit(40);
		 account.deposit(50);
		 account.withDraw(5);
		 account.withDraw(4);
		 account.withDraw(2);
		 
		 System.out.println(account);
		 account.printTransations();
		 
		 
	 }
}
class Transation{
	
	private Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	public Transation(Date date,char type, double amount, double balance, String description) {
		super();
		this.date = date;
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Transation [date=" + date + ", type=" + type + ", amount=" + amount + ", balance=" + balance
				+ ", description=" + description + "]";
	}
	
	
}
