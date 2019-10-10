public class Android extends Mobile{
//
//    public Android(String name, String color, String brand) {
//        super(name, color, brand);
//    }
    private int messageLimit = 10;
    public void call(String message){
        if (message.length() <= messageLimit)
            System.out.println("<Android>Message : " + message);
        else
            System.out.println("<Android>Message cannot be sent");

    }

}
