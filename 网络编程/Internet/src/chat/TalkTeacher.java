package chat;

public class TalkTeacher {
    public static void main(String[] args){
        new Thread(new TalkSend(5555,"localhost",12303)).start();
        new Thread(new TalkReceive(9999,"student")).start();
    }
}
