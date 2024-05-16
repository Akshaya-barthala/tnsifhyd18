package override;

public class parent {
	void instance() {
		System.out.println("instance parent");
	}
	class child extends parent{
		void intance() {
			System.out.println("instance child");
		}
	}
	
}
