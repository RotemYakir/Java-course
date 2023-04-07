package a;

public class TestClient {

	public static void main(String[] args) {

		Client client1 = new Client(101,"Avi",25);
		Client client2 = new Client(102,"Rina",32);
		
		// toString test
		
		System.out.println("first client data: " +client1);
		System.out.println("second client data: " +client2);
		
		
		// equals test
		System.out.println(client1.equals(client2));
		
		
		//hashCode test
		System.out.println(client1.hashCode());
		System.out.println(client2.hashCode());
	}

	
	
}
