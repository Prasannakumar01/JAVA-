package module3;
class Student {
	public void viewing(){
	System.out.println("Students can view the data ");
	}
}
class Admin extends Student{
	public void editing() {
		System.out.println("Admin has the authority to edit and view the data");
	}
}
public class Downcasting {

	public static void main(String[] args) {
		Student s=new Admin();
		s.viewing();
		
		Admin a=(Admin)s;
a.editing();
a.viewing();
	}

}
