package Aggregation;


public class AggreStuAddress {
	String place;
	String district;
	int pincode;
	AggreStudent details;
	public AggreStuAddress(AggreStudent details,String place,String district,int pincode) {
		this.details=details;
		this.place=place;
		this.district=district;
		this.pincode=pincode;
	}
	void display() {
		System.out.println("Name : "+details.name);
		System.out.println("Rollnumber : "+details.rollno);
		System.out.println("Place : "+place);
		System.out.println("District : "+district);
		System.out.println("Pincode : "+pincode);
		
	}
	
	
	public static void main(String[] args) {
		AggreStudent st1=new AggreStudent("Hari",101);
		AggreStudent st2=new AggreStudent("Rahul",102);
		AggreStuAddress stu1=new AggreStuAddress(st1,"Nemom","Trivandrum",695020);
		AggreStuAddress stu2=new AggreStuAddress(st2,"Palayam","Kollam",695000);
		stu1.display();
		System.out.println();
		stu2.display();

	}

}
