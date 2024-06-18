package functions;

class Message {
    String getMessage() {
        return "Java";
    }
}

public class returnType_noArg {
    public static void main(String[] args) {
        Message message = new Message();
        String welcome = message.getMessage();
        System.out.println(welcome); 
    }
}
