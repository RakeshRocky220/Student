
class Student{
	int rollno;
	String name;
	String course;
	String email;
	long mob;
	String address;
	char gender;
	int yearofjoining;
	public Student(int rollno, String name, String course, String email, long mob, String address, char gender,
			int yearofjoining) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.course = course;
		this.email = email;
		this.mob = mob;
		this.address = address;
		this.gender = gender;
		this.yearofjoining = yearofjoining;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", course=" + course + ", email=" + email + ", mob="
				+ mob + ", address=" + address + ", gender=" + gender + ", yearofjoining=" + yearofjoining + "]";
	}
	
	
}

public class StudentApplication {

	public static void main(String[] args) {
		Student ram=new Student(12,"rakesh","java","rakesh@123",9110342725L,"ameerpet",'m',2017);
System.out.println(ram);
	}

}
