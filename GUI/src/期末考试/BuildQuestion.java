package 期末考试;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class BuildQuestion{
    //程序入口
    public static void main(String[] args) {
        System.out.println("数学计算能力训练系统");
        System.out.println("学号:2006030422\t姓名:吴祥波");
        System.out.println("1--加法\t2--减法\t3--乘法\t4--除法\t-1--退出");
        Scanner in = new Scanner(System.in);
        BuildQuestion builder = new BuildQuestion();
        RecordQuestion record = null;
        while (true){
            System.out.println("输入训练项目：");
            int key = in.nextInt();
            if(key ==  1) {
                record = builder.createAddition();
                System.out.println("加法训练");
            }else if(key == 2) {
                record = builder.createSubtraction();
                System.out.println("减法训练");
            }else if(key == 3) {
                record = builder.createMultiplication();
                System.out.println("乘法训练");
            }else if(key == 4) {
                record = builder.createDivision();
                System.out.println("除法训练");
            }else if(key==-1){
                System.out.println("系统退出");
                break;
            }else{
                System.out.println("选项错误，请重新输入");
                continue;
            }
            System.out.print(record.getQuestion()+"=");
            long starTime = System.currentTimeMillis();
            String answer = in.nextInt()+"";
            long endTime = System.currentTimeMillis();
            boolean trueOrFalse = record.fillMyAnswerAndUseTime(answer, (double)(endTime-starTime)/1000);
            System.out.println(trueOrFalse?"答案正确\n":"答案错误\n");
            builder.questionList.add(record);
        }
        in.close();
        System.out.println("===========================训练总结==========================");
        int count = 1;
        for(RecordQuestion i : builder.questionList) {
            System.out.println(count+":"+i);
            count += 1;
        }
        builder.analysisData();
        System.out.println("==============================================================");
    }

    // 存放放所有生成的问题
    private ArrayList<RecordQuestion> questionList = new ArrayList<>();

    // 生成加法题目
    public RecordQuestion createAddition() {
        Random r = new Random();
        int num1;
        int num2;
        do {
            num1 = r.nextInt(51);
        }while(num1 == 0);
        do {
            num2 = r.nextInt(51);
        }while (num2==0);
        String question = num1+"+"+num2;
        String answer = ""+(num1+num2);
        return new RecordQuestion(question, answer, "加法");
    }

    // 生成减法题目
    public RecordQuestion createSubtraction() {
        Random r = new Random();
        int num1;
        int num2;
        do {
            do {
                num1 = r.nextInt(51);
            }while (num1==0);
            do{
                num2 = r.nextInt(51);
            }while (num2==0);
        }while (num1-num2<=0);
        String question = num1+"-"+num2;
        String answer = ""+(num1-num2);
        return new RecordQuestion(question, answer, "减法");
    }

    // 生成乘法题目
    public RecordQuestion createMultiplication() {
        Random r = new Random();
        int num1;
        int num2;
        do {
            num1 = r.nextInt(51);
            num2 = r.nextInt(51);
        }while (num1*num2==0);
        String question = num1+"x"+num2;
        String answer = ""+(num1*num2);
        return new RecordQuestion(question, answer, "乘法");
    }

    // 生成除法题目
    public RecordQuestion createDivision() {
        Random r = new Random();
        int num1;
        int num2;
        do {
            do {
                num1 = r.nextInt(51);
            }while(num1 == 0);
            do{
                num2= r.nextInt(51);
            }while (num2==0);
        }while(num1%num2 != 0);
        String question = num1+"÷"+num2;
        String answer = ""+(num1/num2);
        return new RecordQuestion(question, answer, "除法");
    }

    // 统计用时，准确率
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
        System.out.println("总用时："+totalTime+
                "\n平均用时："+totalTime/this.questionList.size()+
                "\n回答正确数："+countTrue+
                "\n回答错误数："+countFalse+
                "\n正确率："+(double)countTrue/(countTrue+countFalse)*100+"%");
        FileWriter writerAdd = null;
        FileWriter writerSub = null;
        FileWriter writerMul = null;
        FileWriter writerDiv = null;
        // 分类保存数据
        try{
            writerAdd = new FileWriter("加法.txt");
            writerSub = new FileWriter("减法.txt");
            writerMul = new FileWriter("乘法.txt");
            writerDiv = new FileWriter("除法.txt");
            for(RecordQuestion i :questionList){
                if(i.getType().equals("加法")){
                    writerAdd.write(i.toString()+"\n");
                }else if(i.getType().equals("减法")){
                    writerSub.write(i.toString()+"\n");
                }else if(i.getType().equals("乘法")){
                    writerMul.write(i.toString()+"\n");
                }else if(i.getType().equals("除法")){
                    writerDiv.write(i.toString()+"\n");
                }
            }System.out.println("已生成文件");
        } catch(IOException e){
            System.out.println("保存数据出错");
        }
        try{
            assert writerAdd != null;
            writerAdd.close();
            assert writerDiv != null;
            writerDiv.close();
            writerMul.close();
            writerSub.close();
        }catch (IOException e){
            System.out.println("文件关闭失败");
        }
    }
}

class RecordQuestion{
    /*
     * question：储存问题
     * answer：储存答案
     * myAnswer：储存用户写入的答案
     * useTime：储存做这题用的时间
     */
    private String type;
    private String question;
    private String answer;
    private String myAnswer;
    private double useTime;

    public RecordQuestion(String question, String answer, String type) {
        this.type = type;
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {return this.question;}
    public double getUseTime() {return this.useTime;}
    public String getType() {return this.type;}

    // 填入用户的答案和所消耗的时间
    // 返回答案是否正确
    public boolean fillMyAnswerAndUseTime(String myAnswer, double useTime) {
        this.myAnswer = myAnswer;
        this.useTime = useTime;
        return this.answer.equals(myAnswer);
    }

    // 判断用户填入的答案是否正确
    public boolean myAnswerTureOrFalse() {
        return this.answer.equals(myAnswer);
    }

    @Override
    public String toString() {
        return "题目："+this.question +"\t答案："+this.answer+"，我的答案："+this.myAnswer+"\t用时："+this.useTime+"秒";
    }
}
