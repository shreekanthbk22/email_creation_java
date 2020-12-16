package emailapp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter worker name");
		System.out.print("first name: ");
		String f=in.nextLine();
		System.out.println("last name: ");
		String l=in.nextLine();
		String j;
		Email em1=new Email(f,l);

	    System.out.println(em1.showInfo());
	    
	    System.out.println("options \n1.set mailbox capacity \n2.alternate email  \n3.change password");
	    int num=in.nextInt();
	    
	    switch(num)
	    {
	    case 1:System.out.println("enter mailbox capacity");
	           int i=in.nextInt();
	           em1.setMailBoxCapacity(i);
	           System.out.println("updated mailbox capacity is"+em1.getMailBoxCapacity());
	           break;
	           
	    case 2:System.out.println("enter alternate email");
                j=in.nextLine();
                em1.setAlternateEmail(f);;
                System.out.println("updated alternate email is "+em1.getAlternateEmail());
	           break;
	          
	    case 3:System.out.println("enter new password");
                 j=in.nextLine();
                
                 if(j.length()>10)
                 {	 em1.changePassword(j);
                    System.out.println("new password is "+j);
                 }
                 else System.out.println("invalid password length");
               break;
         default:System.out.println("invalid choice");
                 break;
	    }
	    
	}

	
}
