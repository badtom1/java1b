import java.util.Scanner;

public class student_information {
	String name, address,phoneno,emailid,branch;
	double ad_fees,tution_fees,tfees,fee1;
	static String college,col_address,col_phoneno ;
	static {
		college="RVCE";
		col_address="Bengaluru";
		col_phoneno="831045678";
	}
	student_information(String name1, String address1,String phoneno1,String emailid1,String branch1){
		this.name=name1;
		this.address=address1;
		this.phoneno=phoneno1;
		this.emailid=emailid1;
		this.branch=branch1;
	}
	student_information(String name1, String address1,String branch1){
		this.name=name1;
		this.address=address1;
		this.emailid=""+name+"@rvce.edu.in";
		this.branch=branch1;
	}
	public double fee(String branch1 ) {
		this.ad_fees=20000;
		this.tution_fees=200000;
		this.fee1=10000;
		this.tfees=ad_fees+tution_fees+fee1;
		if(branch1.equalsIgnoreCase("BE"))
		{
			tfees+=30000;
		}
		else
		{
			tfees+=25000;
		}
		return tfees;
	}
	public void display() {
		System.out.println("Name:"+name+ "/n Address:"+address+"/n Phone_number:"+phoneno+"/n Email_ID:"+emailid+"/n Branch:"+branch);
		
	}
	public void display1(String branch1) {
		double feecal = this.fee(branch1);
		System.out.println("Total branch fees:"+branch1+"total fees:"+feecal);
		
				
	}
	public void display2(int no_of_fields) {
	
		if(no_of_fields==3) {
			System.out.println("Name:"+name+ "/n Address:"+address+"/n Branch:"+branch);
		}
		else if(no_of_fields==5){
			System.out.println("Name:"+name+ "/n Address:"+address+"/n Phone_number:"+phoneno+"/n Email_ID:"+emailid+"/n Branch:"+branch);
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student_information si;
		Scanner sc = new Scanner(System.in);
		while (true) {
		System.out.println("Enter student details");
		System.out.print("Enter student name:");
		String name=sc.nextLine();
		System.out.print("Enter student address:");
		String address=sc.nextLine();
		System.out.print("Enter branch:");
		String branch=sc.nextLine();
		System.out.print("Would you like to enter phone number and email. If YES PRESS 1");
		int choice= sc.nextInt();
			if(choice==1) {
				System.out.print("Enter phone number:");
				String phoneno=sc.nextLine();
				System.out.print("Enter Email ID:");
				String emailid= sc.nextLine();
				si=new student_information(name,address,phoneno,emailid,branch);
			
			
			}
			else {
			si=new student_information(name,address,branch);
			
		}
		
			
		System.out.println("Choose an option");
		System.out.println("1.Display all details");
		System.out.println("2.Display branch fee");
		System.out.println("3.Display selected fields.ENTER 3 or 5");
		int choice1 =sc.nextInt();
		if (choice1==1) {
			si.display();
		}
		else if(choice1==2) {
			System.out.println("Enter the branch");
			String branch1= sc.next();
			si.display1(branch1);
		}
		else if(choice1==3) {
			si.display2(choice1);
		}
		else if(choice1==5) {
			si.display2(choice1);
		}
		else {
			System.out.println("wrong choice");
		}
		System.out.println("choose an option 1.continue 2. exit");
		int choice3= sc.nextInt();
		if(choice==3) {
			break;
		}
		
		}	
		
	}

}

