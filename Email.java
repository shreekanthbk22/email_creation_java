package emailapp;

import java.util.Scanner;

public class Email {
  private String firstname,lastname,email,password,department,alternateEmail;
  private int mailboxCapacity=500,defaultPasswordLength=10;
  
  private String companySuffix="anycompany.com";
  
  public Email(String firstname,String lastname)//constructor to recieve information
  {
	  this.firstname=firstname;
	  this.lastname=lastname;
	  
	  
	  this.department=setDepartment();//ask department 
	 
	  this.password=randomPassword(defaultPasswordLength);//generate random password
	  System.out.println("your password: "+this.password);
	  
	  email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+"."+companySuffix;
	  System.out.println("your email is: "+email);
  }
  
  private String setDepartment()
  {
	  System.out.println("NEW WORKER: "+firstname+"\nDEPARTMENT CODES \n1.for Sales\n2.for Development \n3.for Accounting \n0.for none \nEnter department code: ");
	  Scanner sc=new Scanner(System.in);
	  int depChoice=sc.nextInt();
	 
	  if(depChoice==1)return "sales";
	  else if(depChoice==2)return "dev";
	  else if(depChoice==3)return "acct";
	  else return "";
	 
  }
  
  private String randomPassword(int length)
  {
	String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()";
	char[] password = new char[length];
	for(int i=0;i<length;i++)
	{
		int rand=(int)(Math.random()*passwordSet.length());
		password[i]=passwordSet.charAt(rand);
	}
	return new String(password);
  }
  
    //set mailbox capacity
    public void setMailBoxCapacity(int capacity){  this.mailboxCapacity=capacity; }
  
    //set alternateemail
    public void setAlternateEmail(String altEmail)  { this.alternateEmail=altEmail; }
  
    //change password
    public void changePassword(String password) { this.password=password;}
  
    //get mailbox capacity
    public int getMailBoxCapacity()  { return mailboxCapacity;}
  
    public String getAlternateEmail() {return alternateEmail;}
    
    public String showInfo()
    {
    	return "DISPLAY NAME:"+firstname+" "+lastname+
    			"\nCOMPANY EMAIL:"+ email +
    			"\nMAILBOX CAPACITY:"+ mailboxCapacity +"mb";
    }
  }
