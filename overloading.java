class overloading {

    void instancenumber(String hello) {
        System.out.println("Instance method: " + hello);
    }
    void instancenumber(int n) {
        System.out.println("Instance method: " + n);
    }
    static void StaticMessage(String hii) {
        System.out.println("Static method: " + hii);
    }
    static void StaticMessage(int n) {
        System.out.println("Static method: " + n);
    }
    public static void main(String[] args) {
         overloading obj = new overloading();

        obj.instancenumber("Hello");
        obj.instancenumber(10);
  
        overloading.StaticMessage("World");
        overloading.StaticMessage(20);
    }
}
