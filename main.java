package overloading;

public class main {
	public static void main(String[] args) {
        overloading1 obj = new overloading1();

       obj.instancenumber("Hello");
       obj.instancenumber(10);
 
       overloading1.StaticMessage("World");
       overloading1.StaticMessage(20);
   }

}
