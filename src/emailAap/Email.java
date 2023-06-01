package emailAap;

import java.util.Scanner;

public class Email {
	private String firstname ;
	private String lastname;
	private String passward;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "aeycompany.com";
	
	// Constructor to receive the first name and last name 
	public Email(String firstname,String lastname) {
		this.firstname = firstname;
		this.lastname  =lastname;
		System.out.println("EMAIL CREATED:" +this.firstname+" "+this.lastname);
		
		// call a method asking for the department -return the the department 
		this.department = setDepartment ();
		System.out.println("Department : "+this.department);
		
		// call a method that returns a random password
		this.passward = randomPassword (defaultPasswordLength);
		System.out.println("Your Password is:"+this.passward);
		
		// Combine elements to generate email
		email  = firstname.toLowerCase() + "." + lastname.toLowerCase () + "@" + department+ "." + companySuffix;
		System.out.println("Your email is : "+email);
	}
	
	//Ask for the department 
	private String setDepartment() {
		System.out.println(" DEPARTMENT CODES \n1 for sales \n2 for Development \n3 for Accounting \n0 for none \n Enter department code :");
		Scanner in = new Scanner (System.in);
		int depChoice  =in.nextInt();
		if (depChoice ==1) {return "Sales ";}
		else if (depChoice ==2) {return "dev";}
		else if (depChoice == 3) {return "acct";}
		else {return "";}
			
		}
		
	
	//Generate a random password 
	private String randomPassword (int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for (int i= 0; i< length; i++) {
		int rand=(int) (Math.random() * passwordSet.length());
		password[i] = passwordSet.charAt(rand);
		
	}
		return new String (password);
	}

	
	//Set the mail box capacity
  public void setmailboxCapacity(int capacity) {
	  this.mailboxCapacity  = capacity;
  }
	
	//Set the alternative email
	public void setAlternativeEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	// Change the password 
	public void changePassword(String password) {
		this.passward = password;
	}
	public int getMailboxCapacity() { return mailboxCapacity;}
	public String getaltnateEmail() {return alternateEmail;}
	public String getPassword() {return passward;}
	
	public String showInfo() {
		return "DISPLAY NAME:"+firstname+ " "+lastname+
				"COMPANY EMAIL:"+email +
				"MAILBOX CAPACITY:"+mailboxCapacity+"mb";
	}
}
	



