public class iPhone extends Mobile{

//    public iPhone(String name, String color, String brand) {
//        super(name, color, brand);
//    }
    private int messageLimit = 15;
    public void call(String message){
        if (message.length() <= messageLimit)
            System.out.println("<iPhone>Message : " + message);
        else
            System.out.println("<iPhone>Message cannot be sent");
    }
}