package BankingAppJavaProgram;
import java.util.ArrayList;
import java.util.List;

	 public class Main {  
		 public class Customer {
		 
	 
	public static void main(String[] args) { 
		
		
	}
		  	private List<BankAccount> bankAccounts;
		      private String panNumber;

		      public List<BankAccount> getBankAccounts() {
		          return bankAccounts;
		      }
		      public void setBankAccounts(BankAccount bankAccount){
		          if (bankAccounts == null){
		              bankAccounts = new ArrayList<>();
		          }
		          bankAccounts.add(bankAccount);
		      }

		      public String getPanNumber() {
		          return panNumber;
		      }

		      public void setPanNumber(String panNumber) {
		          this.panNumber = panNumber;
		      
		  }

		    }
	 }
		

