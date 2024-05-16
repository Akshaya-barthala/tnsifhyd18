public class sample {

    String batsman = "virat";
    static String bowler = "chahal";
    void display(){
        System.out.println("hello");
    }
    static String display1(){
        return "haii";

    }
}
    class Innersample {
    public static void main(String[] args) {
        sample s1=new sample();
        System.out.println(s1.batsman);
       s1.display();
        System.out.println(sample.bowler);
        System.out.println(sample.display1());
        
    }
}    
