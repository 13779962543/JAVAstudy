package chat;


public class TalkStudent {
    public static void main(String[] args){
        new Thread(new TalkSend(7777,"192.168.0.197",9999)).start();
        new Thread(new TalkReceive(1230,"01:")).start();
    }
}
