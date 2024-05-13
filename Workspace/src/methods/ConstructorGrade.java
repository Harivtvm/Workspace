package methods;
public class ConstructorGrade {
	String name;
	int total;
	public ConstructorGrade(String a,int b,int c,int d) {
	name=a;
	total=b+c+d;
	}

public String grade(int n) {
	double per=(n*100/300);
	if(per>=90) {
		return "Grade A";
	}
	else if(per>=70 && per<90) {
		return "Grade B";
	}
	else if(per>=50 && per<70) {
		return "Grade B";
	}
	else {
		return "Fail";
	}
}
	public static void main(String[] args) {
		
		ConstructorGrade st1=new ConstructorGrade("Hari",90,80,70);
		ConstructorGrade st2=new ConstructorGrade("Ravi",95,90,90);
		int haritotal =st1.total;
		int ravitotal=st2.total;
	System.out.println(st1.name+" got total marks of "+st1.total+" and got "+st1.grade(haritotal));
	System.out.println(st2.name+" got total marks of "+st2.total+" and got "+st2.grade(ravitotal));

		
	}
		
		}
		

	


