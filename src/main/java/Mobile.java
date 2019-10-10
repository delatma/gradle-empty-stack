public class Mobile {
    private String name;
    private String color;
    private String brand;

//    public Mobile(String name, String color, String brand){
//        this.name = name;
//        this.color = color;
//        this.brand = brand;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public void call(String message){
        System.out.println("Message : " + message);
    }

    public String mobileInformation(){
        return "name: " + name +
                "\ncolor: " + color +
                "\nbrand: " + brand;
    }

    public static void main (String[] args){
        //create a new Person instance
        Person person1 = new Person();
        final Person IPhoneRobot = new Person();

        //create a new Android mobile
        Mobile samsungS10 = new Android();
        samsungS10.setBrand("Samsung");
        samsungS10.setName("S10");
        samsungS10.setColor("Black");

        //create a new iPhone mobile
        Mobile iphone10S = new iPhone();
        iphone10S.setBrand("Apple");
        iphone10S.setName("10S");
        iphone10S.setColor("Rose Gold");

        //make person1 use different phones with valid message limit
        person1.setName("Mark");
        person1.setPhone(samsungS10);
        samsungS10.call("1234567890");
        System.out.println(person1.getName() + " sent a message with 10 chars using below phone \n"
                + person1.getPhone().mobileInformation()
                + "\n");

        person1.setPhone(iphone10S);
        iphone10S.call("1234567890");
        System.out.println(person1.getName() + " sent a message with 10 chars using below phone \n"
                + person1.getPhone().mobileInformation()
                + "\n");

        //make person1 use different phones with invalid message limit
        person1.setName("Mark");
        person1.setPhone(samsungS10);
        samsungS10.call("1234567890123456");
        System.out.println(person1.getName() + " sent a message with 16 chars using below phone \n"
                + person1.getPhone().mobileInformation()
                + "\n");

        person1.setPhone(iphone10S);
        iphone10S.call("1234567890123456");
        System.out.println(person1.getName() + " sent a message with 16 chars using below phone \n"
                + person1.getPhone().mobileInformation()
                + "\n");

    }
}
