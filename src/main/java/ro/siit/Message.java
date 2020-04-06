package ro.siit;

public class Message {
    private String phoneNumber;
    private String content;

    public Message(String phoneNumber, String content) {
        this.phoneNumber = phoneNumber;
        this.content = content;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getContent() {
        return content;
    }

    public String toString(){
        return "--Message sent to: " + this.phoneNumber +"\n\n" + "--Message content: \n\n" + this.content +"\n --End of message \n\n";
    }

}
