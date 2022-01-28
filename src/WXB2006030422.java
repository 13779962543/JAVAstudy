import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WXB2006030422{
    //�������
    public static void main(String[] args) {
        System.out.println("��ѧ��������ѵ��ϵͳ");
        System.out.println("ѧ��:2006030422\t����:���鲨");
        System.out.println("1--�ӷ�\t2--����\t3--�˷�\t4--����\t0--�˳�");
        Scanner in = new Scanner(System.in);
        WXB2006030422 builder = new WXB2006030422();
        RecordQuestion record = null;
        while (true){
            System.out.println("����ѵ����Ŀ��");
            int key = in.nextInt();
            if(key ==  1) {
                record = builder.createAddition();
                System.out.println("�ӷ�ѵ��");
            }else if(key == 2) {
                record = builder.createSubtraction();
                System.out.println("����ѵ��");
            }else if(key == 3) {
                record = builder.createMultiplication();
                System.out.println("�˷�ѵ��");
            }else if(key == 4) {
                record = builder.createDivision();
                System.out.println("����ѵ��");
            }else if(key==0){
                System.out.println("ϵͳ�˳�");
                break;
            }else{
                System.out.println("ѡ���������������");
                continue;
            }
            System.out.print(record.getQuestion()+"=");
            long starTime = System.currentTimeMillis();
            String answer = in.nextInt()+"";
            long endTime = System.currentTimeMillis();
            boolean trueOrFalse = record.fillMyAnswerAndUseTime(answer, (double)(endTime-starTime)/1000);
            System.out.println(trueOrFalse?"����ȷ\n":"�𰸴���\n");
            builder.questionList.add(record);
        }
        in.close();
        System.out.println("===========================ѵ���ܽ�==========================");
        int count = 1;
        for(RecordQuestion i : builder.questionList) {
            System.out.println(count+":"+i);
            count += 1;
        }
        builder.analysisData();
        System.out.println("==============================================================");
    }

    // ��ŷ��������ɵ�����
    private ArrayList<RecordQuestion> questionList = new ArrayList<>();

    // ���ɼӷ���Ŀ
    public RecordQuestion createAddition() {
        Random r = new Random();
        int num1 = r.nextInt(51);
        int num2 = r.nextInt(51);
        String question = num1+"+"+num2;
        String answer = ""+(num1+num2);
        RecordQuestion record = new RecordQuestion(question, answer);
        return record;
    }

    // ���ɼ�����Ŀ
    public RecordQuestion createSubtraction() {
        Random r = new Random();
        int num1 = r.nextInt(51);
        int num2 = r.nextInt(51);
        String question = num1+"-"+num2;
        String answer = ""+(num1-num2);
        RecordQuestion record = new RecordQuestion(question, answer);
        return record;
    }

    // ���ɳ˷���Ŀ
    public RecordQuestion createMultiplication() {
        Random r = new Random();
        int num1 = r.nextInt(51);
        int num2 = r.nextInt(51);
        String question = num1+"x"+num2;
        String answer = ""+(num1*num2);
        RecordQuestion record = new RecordQuestion(question, answer);
        return record;
    }

    // ���ɳ�����Ŀ
    public RecordQuestion createDivision() {
        Random r = new Random();
        int num1;
        int num2;
        do {
            num1 = r.nextInt(51);
            do {
                num2 = r.nextInt(51);
            }while(num2 == 0);
        }while(num1%num2 != 0);
        String question = num1+"��"+num2;
        String answer = ""+(num1/num2);
        RecordQuestion record = new RecordQuestion(question, answer);
        return record;
    }

    // ͳ����ʱ��׼ȷ��
    public void analysisData() {
        double totalTime = 0;
        int countTrue = 0;
        int countFalse = 0;
        for(RecordQuestion i:this.questionList) {
            totalTime += i.getUseTime();
            if (i.myAnswerTureOrFalse()) {
                countTrue += 1;
            }else {
                countFalse += 1;
            }
        }
        System.out.println("����ʱ��"+totalTime+
                "\nƽ����ʱ��"+totalTime/this.questionList.size()+
                "\n�ش���ȷ����"+countTrue+
                "\n�ش��������"+countFalse+
                "\n��ȷ�ʣ�"+(double)countTrue/(countTrue+countFalse)*100+"%");
    }
}

class RecordQuestion{
    /*
     * question����������
     * answer�������
     * myAnswer�������û�д��Ĵ�
     * useTime�������������õ�ʱ��
     */
    private String question;
    private String answer;
    private String myAnswer;
    private double useTime;

    public RecordQuestion(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {return this.question;}
    public double getUseTime() {return this.useTime;}

    // �����û��Ĵ𰸺������ĵ�ʱ��
    // ���ش��Ƿ���ȷ
    public boolean fillMyAnswerAndUseTime(String myAnswer, double useTime) {
        this.myAnswer = myAnswer;
        this.useTime = useTime;
        return this.answer.equals(myAnswer);
    }

    // �ж��û�����Ĵ��Ƿ���ȷ
    public boolean myAnswerTureOrFalse() {
        return this.answer.equals(myAnswer);
    }

    @Override
    public String toString() {
        return "��Ŀ��"+this.question +"\t�𰸣�"+this.answer+"���ҵĴ𰸣�"+this.myAnswer+"\t��ʱ��"+this.useTime+"��";
    }
}