package chat;

public class TalkStudent {
    public static void main(String[] args){
        new Thread(new TalkSend(7777,"localhost",9999)).start();
        new Thread(new TalkReceive(12303,"teacher")).start();
    }
}
