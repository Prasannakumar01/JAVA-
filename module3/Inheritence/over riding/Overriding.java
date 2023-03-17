package module3;

class Zomato{
	public void getRestarnt() {
		System.out.println("Get the location of the customer");
	}
}
class User extends Zomato{
	public void getRestarnt() {
		System.out.println("Get the Restarunt name :");
	}
	
}
public class Overriding {

	public static void main(String[] args) {
		User u=new User();
		u.getRestarnt();
		
	}

}
