package Org.student;

public class Students {

	// Create multiple getStudentInfo() method by passing id argument alone, by id &
	// name, by email & phoneNumber

	public String getStudentInfo(String ID, String Name, String Email, String Phonenumber) {

		System.out.println("Student info is " + " ID " + ID + " Name is " + Name + " Email " + Email + " Phonenumber "
				+ Phonenumber);

		return Name;
	}

	public static void main(String[] args) {
		Students St = new Students();
		St.getStudentInfo("123", "Aswin", "ashwinmoorthy27@gmail.com", "+91 9789189002");
	}
}
