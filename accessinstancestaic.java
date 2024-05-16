class  myclass{
    int instanceVariable = 10; 

    static int staticVariable = 20;

    void instanceMethod() {
        System.out.println("Instance method");
    }

    static void staticMethod() {
        System.out.println("Static method");
    }

    public static void main(String[] args) {
        
        System.out.println("Accessing static variable: " + myclass.staticVariable);
        myclass.staticMethod();
        myclass obj = new myclass();
        
        System.out.println("Accessing instance variable: " + obj.instanceVariable);
        obj.instanceMethod();
    }
}
