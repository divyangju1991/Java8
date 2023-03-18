package designPattern;

class BankAccount {
    
	private String name;
    private String accountNumber;
    private String email;
    private boolean newsletter;
    private BankAccountBuilder bankAccountBuilder;

    private BankAccount(BankAccountBuilder bankAccountBuilder) {
		this.bankAccountBuilder = bankAccountBuilder;
		this.name = bankAccountBuilder.name;
		this.accountNumber = bankAccountBuilder.accountNumber;
		this.email = bankAccountBuilder.email;
	}
    
    static class BankAccountBuilder {
    	
    	    private String name;
    	    private String accountNumber;
    	    private String email;
    	    private boolean newsletter;
    	    
    	    public BankAccountBuilder(String name, String accountNumber) {
    	        this.name = name;
    	        this.accountNumber = accountNumber;
    	    }

    	    public BankAccountBuilder withEmail(String email) {
    	        this.email = email;
    	        return this;
    	    }

    	    public BankAccountBuilder wantNewsletter(boolean newsletter) {
    	        this.newsletter = newsletter;
    	        return this;
    	    }
    	    
    	    public BankAccount build() {
    	        return new BankAccount(this);
    	    }
    }


	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", accountNumber=" + accountNumber + ", email=" + email + ", newsletter="
				+ newsletter + ", bankAccountBuilder=" + bankAccountBuilder + "]";
	}
    
}

public class Builder {
  
	public static void main(String args[]){
		
		BankAccount newAccount = new BankAccount
				  .BankAccountBuilder("Jon", "22738022275")
				  .withEmail("jon@example.com")
				  .wantNewsletter(true)
				  .build();
		
		System.out.println(newAccount.toString());
	}
}