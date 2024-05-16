public class Constructor {
    private String driver;
    private String engine;
    private String doors;
    private int speed;

    // Constructor
    public Constructor() {
        driver = "seaten";
        engine = "on";
        doors = "close";
        speed = 10;
    }

    public String run() {
        if (driver.equals("seaten") && engine.equals("on") && doors.equals("close") && speed > 0) {
            return "Car is running";
        } else {
            return "Car is not started";
        }
    }

    public static void main(String[] args) {

        Constructor c1 = new Constructor();
        System.out.println(c1.run());
    }
}
