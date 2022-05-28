package Week3.Day1;

public class Students {
public void getstudentsInfo()
{
	System.out.println("Default Arguement Method");
	System.out.println("Student Id: 12003");
	System.out.println("Student Name:Rajalakshmi Mahalingam");
	System.out.println("Student Email:raji5.maha@gmail.com");
	System.out.println("Student Phone Number: 8939946155");
	}
public void getStudentsInfo(int Studentid)
{
	System.out.println("Single Argument Method");
	System.out.println("Student Id is: "+Studentid);
}
public void getStudentsInfo(int Studentid, String Studentname)
{
	System.out.println("Two Argument Method: ID and Name");
	System.out.println("Student Id and Student Name is: "+ Studentid  +" "   +Studentname);
	
}
public void getStudentsInfo(String StudentEmail, int Studentphone)
{
	System.out.println("Two Argument method: Email and Phone Number");
	System.out.println("Student Student Email and Student Phone Number is: "+StudentEmail +" "   +Studentphone);
}       

	public static void main(String[] args) {
		
		Students s=new Students();
		s.getstudentsInfo(); 
		s.getStudentsInfo(12003);
		s.getStudentsInfo(12003,"Rajalakshmi");
		s.getStudentsInfo("raji5.maha@gmail.com",8939946);
		
	}

}
