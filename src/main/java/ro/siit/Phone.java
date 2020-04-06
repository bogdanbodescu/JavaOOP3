package ro.siit;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

abstract public class Phone {
    protected List<Message> messageList = new ArrayList<>();
    protected List<String> callHistory = new ArrayList<>();
    protected List<Contact> contactList = new ArrayList<>();
    protected int batteryLife;
    protected String color, material;
    protected UUID imei;

    protected Phone(int batteryLife, String color, String material, UUID imei) {
        this.batteryLife = batteryLife;
        this.color=color;
        this.material=material;
        this.imei=imei;
    }

    public void addContact(String id, String phoneNumber, String firstName, String lastName){
        contactList.add(new Contact(id,phoneNumber,firstName,lastName));

    }

    public void listContacts(){
        String temp ="";
        for (Contact c:contactList
             ) {
            temp+=c;

        }
        System.out.println(temp);
    }

    public void sendMessage(String phoneNumber,String message){
        if(batteryLife>=1) {
            while (batteryLife >= 1) {
                if (message.length() == 0)
                    break;
                if (message.length() > 500) {
                    messageList.add(new Message(phoneNumber, message.substring(0, 500)));
                    batteryLife--;
                    message = message.substring(500);
                } else {
                    messageList.add(new Message(phoneNumber, message));
                    batteryLife--;
                    break;
                }

            }
        }
        else
            System.out.println("Battery too low. The action to send messages cannot be completed.");
    }

    public void listMessages(String phoneNumber){
        String temp="";
        for (Message m:messageList
             ) {
            if(m.getPhoneNumber().equals(phoneNumber))
                temp+=m;
        }
        System.out.println(temp);
    }

    public void call(String phoneNumber){
        if(batteryLife>=2){
            callHistory.add(phoneNumber);
            batteryLife-=2;
        }
        else
            System.out.println("Battery too low. The action to your contacts cannot be completed.");

    }

    public void viewHistory(){
        String temp="";
        for (String s: callHistory
             ) {
            temp+="You have called " +s;
        }
        System.out.println(temp);
    }

}
